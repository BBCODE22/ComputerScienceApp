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


    public void initialize()
    {
        ai = new AIGemini();
        answerTextArea.setWrapText(true);
        answerTextArea.setEditable(false);
    }
    public void handleAskQuestion()
    {
        String question = questionTextField.getText();
        String answer = ai.askQuestion(question);
        answerTextArea.setText(answer);
    }
}
