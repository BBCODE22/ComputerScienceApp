package nclan.ac.spa.controllers;

import javafx.concurrent.Task;
import javafx.fxml.FXML;

import javafx.scene.control.*;
import nclan.ac.cs.topic5.AIGemini;

public class AIChatController {


    @FXML
    TextField questionTextField;
    @FXML
    TextArea answerTextArea;
    @FXML
    Button askQuestionButton;



private AIGemini ai;

/**
* Sets up the AI instance and sets the answer area when the screen loads.
*/
public void initialize()
{
        ai = new AIGemini();
        answerTextArea.setWrapText(true);
        answerTextArea.setEditable(false);
}
/**
* Takes the question from the text field, sends it to the AI, and displays the response.
*/
public void handleAskQuestion()
{
    String question = questionTextField.getText();

    // Disable the button and show a waiting message while the AI responds
    askQuestionButton.setDisable(true);
    answerTextArea.setText("Thinking...");

    // Task runs the slow network call on a background thread
    Task<String> askTask = new Task<>()
    {
        @Override
        protected String call() {
            return ai.askQuestion(question);   // runs OFF the FX thread
        }
    };

    // setOnSucceeded runs back ON the FX thread, so it's safe to touch the UI
    askTask.setOnSucceeded(event ->
    {
        answerTextArea.setText(askTask.getValue());
        askQuestionButton.setDisable(false);
    });

    // If the task throws, re-enable the button and show a message
    askTask.setOnFailed(event ->
    {
        answerTextArea.setText("Something went wrong. Please try again.");
        askQuestionButton.setDisable(false);
    });

    // Start the background thread
    Thread thread = new Thread(askTask);
    thread.setDaemon(true);   // won't block app shutdown
    thread.start();
    }
}
