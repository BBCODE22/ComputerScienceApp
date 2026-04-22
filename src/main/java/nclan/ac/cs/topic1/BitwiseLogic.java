package nclan.ac.cs.topic1;

public class BitwiseLogic {




/**
 * Performs a bitwise AND on two binary strings and returns the result as binary.
 *
 * @param num1 first binary number as a string
 * @param num2 second binary number as a string
 * @return result of AND operation as a binary string
 */
static public String binaryAND(String num1, String num2)
{
    num1 = Conversion.convertBinaryToDecimal(num1);
    num2 = Conversion.convertBinaryToDecimal(num2);
    int result = Integer.valueOf(num1) & Integer.valueOf(num2);

    return Conversion.convertDecimalToBinary(result);
}
/**
 * Performs a bitwise OR on two binary strings and returns the result as binary.
 *
 * @param num1 first binary number as a string
 * @param num2 second binary number as a string
 * @return result of OR operation as a binary string
 */
public static String binaryOR(String num1, String num2)
{
    num1 = Conversion.convertBinaryToDecimal(num1);
    num2 = Conversion.convertBinaryToDecimal(num2);

    int result = Integer.valueOf(num1) | Integer.valueOf(num1);
    return Conversion.convertDecimalToBinary(result);
}
/**
 * Performs a bitwise XOR on two binary strings and returns the result as binary.
 *
 * @param num1 first binary number as a string
 * @param num2 second binary number as a string
 * @return result of XOR operation as a binary string
 */
public static String binaryXOR(String num1, String num2)
{
    num1 = Conversion.convertBinaryToDecimal(num1);
    num2 = Conversion.convertBinaryToDecimal(num2);

    int result = Integer.valueOf(num1) ^ Integer.valueOf(num2);
    return Conversion.convertDecimalToBinary(result);
}
/**
 * Method pads binary results with extra 0s until the number contains 8 0s or 1s. Method kept in the Bitwise file because conversion methods already pad.
 * @param prePad
 * @return prePad
 */
public static String padLeftBinary(String prePad)
{

boolean isNegative = false;
if (prePad.contains("-")) {
    isNegative = true;
}
    int length = 8;
    if (prePad.length() >= length )
    {
        return prePad;
    }
    if(isNegative)
    {
        prePad = prePad.substring(1);
    }

    //StringBuilder sb = new StringBuilder();
    while (prePad.length() < length)
    {
        prePad = "0" + prePad;
    }

    if (isNegative ==true)
    {
        return "-" + prePad;
    }
    else
    {
        return prePad;
    }

}
/**
 * Adds two hex numbers together and returns the result as hex.
 *
 * @param num1 first hex number as a string
 * @param num2 second hex number as a string
 * @return sum as a hex string
 */
public static String hexAdd(String num1, String num2)
{
    int firstNumber = Integer.parseInt(Conversion.convertHexToDecimal(num1));
    int secondNumber = Integer.parseInt(Conversion.convertHexToDecimal(num2));

    int result = firstNumber + secondNumber;

    return Conversion.convertDecimalToHex(result);
}
/**
 * Subtracts the second hex number from the first and returns the result as hex.
 * Returns a negative value if the result drops below zero.
 *
 * @param num1 first hex number as a string
 * @param num2 second hex number as a string
 * @return difference as a hex string
 */
public static String hexSub(String num1, String num2)
{
    int firstNumber = Integer.parseInt(Conversion.convertHexToDecimal(num1));
    int secondNumber = Integer.parseInt(Conversion.convertHexToDecimal(num2));

    int result = firstNumber - secondNumber;

    if (result < 0)
    {
        return "-" + Conversion.convertDecimalToHex(-result);
    }
    return Conversion.convertDecimalToHex(result);
}
/**
 * Adds two binary numbers together and returns the result as binary.
 *
 * @param num1 first binary number as a string
 * @param num2 second binary number as a string
 * @return sum as a binary string
 */
public static String binaryAdd(String num1, String num2)
{
    int firstNumber = Integer.parseInt(Conversion.convertBinaryToDecimal(num1));
    int secondNumber = Integer.parseInt(Conversion.convertBinaryToDecimal(num2));

    int result = firstNumber + secondNumber;

    return Conversion.convertDecimalToBinary(result);
}
/**
 * Subtracts the second binary number from the first and returns the result as binary.
 * Returns a negative value if the result drops below zero.
 *
 * @param num1 first binary number as a string
 * @param num2 second binary number as a string
 * @return difference as a binary string
 */
public static String binarySub(String num1, String num2)
{
    int firstNumber = Integer.parseInt(Conversion.convertBinaryToDecimal(num1));
    int secondNumber = Integer.parseInt(Conversion.convertBinaryToDecimal(num2));

    int result = firstNumber - secondNumber;
    if (result < 0)
    {
        return "-" + Conversion.convertDecimalToBinary(-result);
    }

    return Conversion.convertDecimalToBinary(result);
}
}

