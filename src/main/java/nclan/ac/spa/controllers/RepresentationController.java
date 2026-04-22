package nclan.ac.spa.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import nclan.ac.cs.topic1.Conversion;
import nclan.ac.cs.topic1.Main;
import nclan.ac.cs.topic1.Representation;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class RepresentationController {

    //single character initialisation
    @FXML
    TextField charInput;
    @FXML
    Button charButton;
    @FXML
    Label charDecimalResult;
    @FXML
    Label charHexResult;
    @FXML
    Label charBinaryResult;

    //String to Hex Initialisation
    @FXML
    TextField stringInputTextField;
    @FXML
    Button stringToHexButton;
    @FXML
    Label toHexResult;

    //Hex to String Initialisation
    @FXML
    TextField hexInputTextField;
    @FXML
    Button hexToStringButton;
    @FXML
    Label toStringResult;

/**
 * Limits the character input field to a single character.
 */
@FXML
public void initialize()
{
        charInput.setTextFormatter(new TextFormatter<>(change ->
                change.getControlNewText().length() <= 1 ? change : null
        ));
    }

/**
 * Takes the single character input and displays its decimal, hex, and binary representations.
 * Shows an error if the field is empty.
 */
@FXML
private void handleChar()
{


        try {
            int resultDecimal = Representation.charToASCII(charInput.getCharacters().charAt(0));
            charDecimalResult.setText(String.valueOf(resultDecimal));

            String resultHex = (Conversion.convertDecimalToHex(Representation.charToASCII(charInput.getCharacters().charAt(0))));
            charHexResult.setText(String.valueOf(resultHex));

            String resultBinary = (Conversion.convertDecimalToBinary(Representation.charToASCII(charInput.getCharacters().charAt(0))));
            charBinaryResult.setText(String.valueOf(resultBinary));
        }
        catch (RuntimeException emptyErr)
        {
            Main.showError("You have not entered anything");
        }
    }

/**
 * Converts the string input to its hex representation and displays the result.
 * Shows an error message if the field is empty.
 */
@FXML
private void handleString()
{


        String userInput = stringInputTextField.getText();
        if (userInput.isEmpty())
        {
            toHexResult.setText("You have not entered anything!");
        }
        else
        {
            String result = Representation.stringToHex(userInput);
            toHexResult.setText(result);
        }
    }

/**
 * Converts separated hex values back into a readable string and displays the result.
 * Validates that the input only if it contains hex characters and is spaced properly.
 */
@FXML
private void handleHex()
{
        if (!hexInputTextField.getText().matches("[0-9A-Fa-f ]+")) {
            Main.showError("Please enter valid hex values only");
            return;
        }
        for (String token : hexInputTextField.getText().split(" ")) {
            if (token.length() > 2) {
                Main.showError("Please separate hex values with spaces");
                return;
            }
        }
        try
        {
            toStringResult.setText(Representation.hexToString(hexInputTextField.getText()));
        }
        catch (Exception e)
        {
            Main.showError("Invalid input, please enter space separated hex values");
        }
    }











}
