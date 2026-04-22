package nclan.ac.spa.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import nclan.ac.cs.topic1.Conversion;




public class ConversionController {

@FXML
Button convertButton;

@FXML
TextField inputField;

@FXML
Label resultLabel;

@FXML
ComboBox<String> fromCombo;

@FXML
ComboBox<String> toCombo;

@FXML

public void initialize()
{
    fromCombo.getItems().add("Binary");
    fromCombo.getItems().add("Decimal");
    fromCombo.getItems().add("Hexadecimal");

        fromCombo.valueProperty().addListener((observable, oldValue, newValue) -> {
        toCombo.getItems().clear();
        if (newValue.equals("Binary"))
        {
            toCombo.getItems().add("Decimal");
            toCombo.getItems().add("Hexadecimal");
        }
        else if (newValue.equals("Decimal"))
        {
            toCombo.getItems().add("Binary");
            toCombo.getItems().add("Hexadecimal");
        }
        else if (newValue.equals("Hexadecimal"))
        {
            toCombo.getItems().add("Binary");
            toCombo.getItems().add("Decimal");
        }
    });
}
/**
 * Reads the user's input and selected number bases, then performs the
 * appropriate conversion and displays the result. Validates input format
 * before converting.
 */
public void handleConvert(){
    String from = fromCombo.getValue();
    String to = toCombo.getValue();
    String input = inputField.getText();
    String result = "";

    if(from.equals("Decimal") && to.equals("Binary"))
    {
        if (input.matches ("[0-9]+")) {
            result = Conversion.convertDecimalToBinary(Integer.parseInt(input));
            resultLabel.setText(result);
        }
        else
        {
            resultLabel.setText("Please only enter numbers 0-9");
        }
    }
    else if(from.equals("Decimal") && to.equals("Hexadecimal"))
    {
        if (input.matches ("[0-9]+")) {
            result = Conversion.convertDecimalToHex(Integer.parseInt(input));
            resultLabel.setText(result);
        }
        else
        {
            resultLabel.setText("Please only enter numbers 0-9");
        }
    }
    else if(from.equals("Binary") && to.equals("Decimal"))
    {
        if (input.matches("[0-1]+"))
        {
            result = Conversion.convertBinaryToDecimal(input);
            resultLabel.setText(result);
        }
        else
        {
            resultLabel.setText("Please only enter 0s and 1s");
        }
    }
    else if(from.equals("Binary") && to.equals("Hexadecimal"))
    {
        if (input.matches("[0-1]+"))
        {
            result = Conversion.convertBinaryToHex(input);
            resultLabel.setText(result);
        }
        else
        {
            resultLabel.setText("Please only enter 0s and 1s");
        }
    }
    else if(from.equals("Hexadecimal") && to.equals("Decimal"))
    {
        if (input.matches("[0-9a-fA-F]+"))
        {
            result = Conversion.convertHexToDecimal(input);
            resultLabel.setText(result);
        }
        else
        {
            resultLabel.setText("Please only enter numbers 0-9 and letters A-F");
        }
    }
    else if(from.equals("Hexadecimal") && to.equals("Binary")) {
        if (input.matches("[0-9a-fA-F]+")) {
            result = Conversion.convertHexToBinary(input);
            resultLabel.setText(result);
        } else {
            resultLabel.setText("Please only enter numbers 0-9 and letters A-F");

        }


    }
}
}
