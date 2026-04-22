package nclan.ac.cs.topic1;
import java.util.ArrayList;

public class Conversion {
    public static void main(String[] args){


}

/**
 * Converts decimal to a binary using repeated division.
 *
 * @param decimal the decimal number to convert
 * @return binary representation as a string
 */
public static String convertDecimalToBinary(int decimal)
{
    ArrayList<Integer> remainder = new ArrayList<Integer>();
    String result = "";
    while (decimal > 0) {
        remainder.add(Integer.valueOf(decimal % 2));
        decimal = decimal / 2;
    }

    for (int i = remainder.size() - 1; i>=0; i-- )
    {
        result += remainder.get(i);
    }
    return result;
}
/**
 * Converts decimal to a hex string.
 *
 * @param decimal the decimal number to convert
 * @return hex representation as an uppercase string
 */
public static String convertDecimalToHex(int decimal)
{
    String hexValues [] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};
    String hexAnswer = "";

    while (decimal > 0)
    {
        int remainder = decimal % 16;
        decimal = decimal / 16;

        hexAnswer = hexAnswer + hexValues[remainder];
    }
    return hexAnswer = new StringBuilder(hexAnswer).reverse().toString();
}
/**
 * Converts binary to decimal.
 *
 * @param rawBinary the binary string to convert
 * @return decimal value as a string
 */
public static String convertBinaryToDecimal(String rawBinary)
{
    int result = 0;
    for (int i = 0; i < rawBinary.length(); i++) {
        int digit = rawBinary.charAt(i) - '0';  // Get the digit (0 or 1)
        result = result * 2 + digit;         // Apply the formula
    }

    return Integer.toString(result);
}
/**
 * Converts binary to hex.
 *
 * @param rawBinary the binary string to convert
 * @return hex representation as an uppercase string
 */
public static String convertBinaryToHex(String rawBinary)
{

    String hexResult = "";
    int binaryLength = rawBinary.length();
    int remainder = binaryLength % 4;
    String hexValues [] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};
    if (remainder > 0)
    {

        for (int zeroAdded = 4 - remainder; zeroAdded > 0 ; zeroAdded--)
        {
            rawBinary = "0" + rawBinary;
        }
    }
    for (int i = 0; i < rawBinary.length(); i +=4)
    {
        String brokenUp = rawBinary.substring(i, i+4);
        int chunkResult=0;
        for (int ii = 0; ii < brokenUp.length(); ii++) {

            int digit = brokenUp.charAt(ii) - '0';
            chunkResult = chunkResult * 2 + digit;

            }
        hexResult = hexResult + hexValues[chunkResult];

    }
    int dirtyHex = Integer.parseInt(hexResult, 16);
    String cleanHex = Integer.toHexString(dirtyHex);
    cleanHex =cleanHex.toUpperCase();
    return cleanHex;
}
/**
 * Converts hex to decimal.
 *
 * @param hexNumber the hex string to convert
 * @return decimal value as a string
 */
public static String convertHexToDecimal(String hexNumber)
{
    String decimalNumber = "";
    int decimalResult = 0;
    for (int i = 0; i < hexNumber.length(); i++)
        {
            char hexChar = hexNumber.charAt(i);
            int decimalDigit = Character.digit(hexChar, 16);
            decimalResult = decimalResult * 16 + decimalDigit;
    }
    return String.valueOf(decimalResult);
}
/**
 * Converts hex to binary.
 * Works by first converting hex to decimal, then decimal to binary.
 *
 * @param hexNumber the hex string to convert
 * @return binary representation as a string
 */
public static String convertHexToBinary(String hexNumber)
{

    String decimalNumber = "";
    int decimalResult = 0;
    for (int i = 0; i < hexNumber.length(); i++)
    {
        char hexChar = hexNumber.charAt(i);
        int decimalDigit = Character.digit(hexChar, 16);
        decimalResult = decimalResult * 16 + decimalDigit;
    }


    ArrayList<Integer> remainderArray = new ArrayList<Integer>();
    String binaryResult = "";
    while (decimalResult > 0) {
        remainderArray.add(Integer.valueOf(decimalResult % 2));
        decimalResult = decimalResult / 2;
    }

    for (int i = remainderArray.size() - 1; i>=0; i-- )
    {
        binaryResult += remainderArray.get(i);
    }

    return binaryResult;
}
}
