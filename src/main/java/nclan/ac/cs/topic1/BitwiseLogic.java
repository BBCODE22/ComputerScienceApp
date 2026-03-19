package nclan.ac.cs.topic1;

public class BitwiseLogic {





static public String binaryAND(String num1, String num2)
{
    num1 = Conversion.convertBinaryToDecimal(num1);
    num2 = Conversion.convertBinaryToDecimal(num2);
    int result = Integer.valueOf(num1) & Integer.valueOf(num2);

    return Conversion.convertDecimalToBinary(result);
}
public static String binaryOR(String num1, String num2)
{
    num1 = Conversion.convertBinaryToDecimal(num1);
    num2 = Conversion.convertBinaryToDecimal(num2);

    int result = Integer.valueOf(num1) | Integer.valueOf(num1);
    return Conversion.convertDecimalToBinary(result);
}
public static String binaryXOR(String num1, String num2)
{
    num1 = Conversion.convertBinaryToDecimal(num1);
    num2 = Conversion.convertBinaryToDecimal(num2);

    int result = Integer.valueOf(num1) ^ Integer.valueOf(num2);
    return Conversion.convertDecimalToBinary(result);
}
/**
 * Method pads binary results with extra 0s until the number contains 8 0s or 1s. Method kept in the Bitwise file because conversion methos already pad.
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
public static String hexAdd(String num1, String num2)
{
    int firstNumber = Integer.parseInt(Conversion.convertHexToDecimal(num1));
    int secondNumber = Integer.parseInt(Conversion.convertHexToDecimal(num2));

    int result = firstNumber + secondNumber;

    return Conversion.convertDecimalToHex(result);
}
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
public static String binaryAdd(String num1, String num2)
{
    int firstNumber = Integer.parseInt(Conversion.convertBinaryToDecimal(num1));
    int secondNumber = Integer.parseInt(Conversion.convertBinaryToDecimal(num2));

    int result = firstNumber + secondNumber;

    return Conversion.convertDecimalToBinary(result);
}
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

