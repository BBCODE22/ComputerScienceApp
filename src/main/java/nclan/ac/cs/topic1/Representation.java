package nclan.ac.cs.topic1;

public class Representation {

/**
 * Returns the ASCII decimal value of a single character.
 *
 * @param singleChar the character to convert
 * @return the ASCII decimal value
 */
public static int charToASCII(char singleChar)
    {
        return singleChar;
    }

/**
 * Converts each character in a string to its ASCII decimal value,
 * returning them as a string.
 *
 * @param manyChars the string to convert
 * @return separated ASCII decimal values
 */
public static String stringToASCII(String manyChars)
{
        char[] arrayChars = manyChars.toCharArray();

        StringBuilder returnValues = new StringBuilder();

        for (char c : arrayChars) {
            returnValues.append(charToASCII(c));
            returnValues.append(" ");
        }
        String result = returnValues.toString();
        result = result.strip();
        return result;
    }

/**
 * Converts each character in a string to its hex equivalent,
 * returning them as a space-separated string.
 *
 * @param manyChars the string to convert
 * @return space-separated hex values
 */
public static String stringToHex(String manyChars)
{
        char[] arrayChars = manyChars.toCharArray();
        String returnValues = "";

        for (char c : arrayChars) {
            int val = (int) c;
            String strVal = Conversion.convertDecimalToHex(val);

            returnValues += strVal + " ";

        }
        return returnValues.trim();
    }

/**
 * Converts a decimal integer to its matching character.
 *
 * @param value the decimal ASCII value
 * @return the matching character
 */
public static char decimalToChar(int value)
{
        char result = (char) value;
        return result;
    }

/**
 * Converts a string of decimal ASCII values back into a readable string.
 *
 * @param intString space separated decimal values
 * @return the reconstructed string
 */
public static String decimalsToString(String intString)
{
        String[] numbers = intString.split(" ");
        StringBuilder result = new StringBuilder();

        for (String num : numbers) {
            int val = Integer.parseInt(num.strip());
            result.append(decimalToChar(val));
        }

        return result.toString();
    }

/**
 * Converts a string of hex values back into a readable string.
 *
 * @param hexString space separated hex values
 * @return the reconstructed string
 */
public static String hexToString(String hexString)
{
        String[] hexValues = hexString.split(" ");
        StringBuilder result = new StringBuilder();

        for (String hex : hexValues) {
            int decimal = Integer.parseInt(Conversion.convertHexToDecimal(hex.strip()));
            result.append(Representation.decimalToChar(decimal));
        }

        return result.toString();
    }
}

