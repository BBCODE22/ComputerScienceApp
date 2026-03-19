package nclan.ac.spa.controllers;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import nclan.ac.cs.topic1.BitwiseLogic;
import nclan.ac.cs.topic1.Conversion;
import javafx.fxml.FXML;

import java.security.cert.PolicyNode;




public class BitwiseLogicController {

    @FXML
    ComboBox<String> operationComboBox;
    @FXML
    TextField firstTextField;
    @FXML
    TextField secondTextField;
    @FXML
    Button comparitiveButton;
    @FXML
    Label comparitiveResultLabel;



    @FXML
    ComboBox<String> numberBaseComboBox;
    @FXML
    TextField thirdTextField;
    @FXML
    TextField fourthTextField;
    @FXML
    Label addOrMinusLabel;
    @FXML
    ToggleButton addSelectButton;
    @FXML
    ToggleButton minusSelectButton;
    @FXML
    Button calculateButton;
    @FXML
    Label calculateResultLabel;
    @FXML
    AnchorPane rootAnchor;

public void initialize ()
{
operationComboBox.getItems().add("AND");
operationComboBox.getItems().add("OR");
operationComboBox.getItems().add("XOR");

numberBaseComboBox.getItems().add("Binary");
numberBaseComboBox.getItems().add("Hexadecimal");

}
public void handleBitwise() {
    String operation = operationComboBox.getValue();
    String inputOne = firstTextField.getText();
    String inputTwo = secondTextField.getText();
    String result = "";
    if (inputOne.matches("[0-1]+")) {

        if (operation.equals("AND"))
        {
            result = BitwiseLogic.binaryAND(inputOne, inputTwo);
            result = BitwiseLogic.padLeftBinary(result);
            comparitiveResultLabel.setText(result);
        }
        else if (operation.equals("OR"))
        {
            result = BitwiseLogic.binaryOR(inputOne, inputTwo);
            result = BitwiseLogic.padLeftBinary(result);
            comparitiveResultLabel.setText(result);
        }
        else if (operation.equals("XOR"))
        {
            result = BitwiseLogic.binaryXOR(inputOne, inputTwo);
            result = BitwiseLogic.padLeftBinary(result);
            comparitiveResultLabel.setText(result);
        }
    }
    else if (operationComboBox.getValue() == null)
    {
        comparitiveResultLabel.setText("Please select an option from the drop box.");
    }
    else
    {
        comparitiveResultLabel.setText("Please only enter 0s and 1s.");
    }
    if (!addSelectButton.isSelected() && !minusSelectButton.isSelected())
    {
        addOrMinusLabel.setText("");
    }


}
public void handleMath()
{
    String comboValue = numberBaseComboBox.getValue();
    String firstNumber = thirdTextField.getText();
    String secondNumber = fourthTextField.getText();

    String result = "";

    if (comboValue.equals("Binary"))
    {
        if(firstNumber.matches("[0-1]+") && secondNumber.matches("[0-1]+"))
        {
            if (addSelectButton.isSelected()) {
                result = BitwiseLogic.binaryAdd(firstNumber, secondNumber);
                result = BitwiseLogic.padLeftBinary(result);

                calculateResultLabel.setText(result);
            }
            else if (minusSelectButton.isSelected())
            {
                result = BitwiseLogic.binarySub(firstNumber, secondNumber);
                result = BitwiseLogic.padLeftBinary(result);

                calculateResultLabel.setText(result);
            }
            else
            {
                calculateResultLabel.setText("You must select either + or _");
            }
        }
        else
        {
            calculateResultLabel.setText("Please only enter 0s and 1s!");
        }
    }
    else if(comboValue.equals("Hexadecimal"))
    {
        if(firstNumber.matches("[0-9a-fA-F]+") && secondNumber.matches("[0-9a-fA-F]+"))
        {
            if (addSelectButton.isSelected())
            {

                result = BitwiseLogic.hexAdd(firstNumber, secondNumber);
                calculateResultLabel.setText(result);
            }
            else if (minusSelectButton.isSelected())
            {
                result = BitwiseLogic.hexSub(firstNumber, secondNumber);
                calculateResultLabel.setText(result);
            }
            else
            {
                calculateResultLabel.setText("You must select either + or _");
            }

        }
        else
        {
            calculateResultLabel.setText("Please only use Hex characters 0-9 and A-F");
        }
    }
    else
    {
        calculateResultLabel.setText("You have not selected a number system!");
    }

}
public void handleToggle()
{
    if (addSelectButton.isSelected())
    {
        addOrMinusLabel.setText("+");
        minusSelectButton.setSelected(false);
    }
    if (!addSelectButton.isSelected() && !minusSelectButton.isSelected())
    {
        addOrMinusLabel.setText("");
    }

}
public void handleMinusToggle()
{
    if (minusSelectButton.isSelected())
    {
        addOrMinusLabel.setText("-");
        addSelectButton.setSelected(false);
    }
    if (!addSelectButton.isSelected() && !minusSelectButton.isSelected())
    {
        addOrMinusLabel.setText("");
    }
}







}
