package nclan.ac.spa.controllers;

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
* Sets up the AI instance and configures the answer area when the screen loads.
*/
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
        String answer = ai.askQuestion(question);
        answerTextArea.setText(answer);
    }
}
