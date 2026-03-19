package nclan.ac.cs.topic1;

public class Representation {


    public static int charToASCII(char singleChar) {
        return singleChar;
    }
    public static String stringToASCII(String manyChars) {
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
    public static String stringToHex(String manyChars) {
        char[] arrayChars = manyChars.toCharArray();
        String returnValues = "";

        for (char c : arrayChars) {
            int val = (int) c;
            String strVal = Conversion.convertDecimalToHex(val);

            returnValues += strVal + " ";

        }
        return returnValues.trim();
    }
    public static char decimalToChar(int value) {
        char result = (char) value;
        return result;
    }
    public static String decimalsToString(String intString) {
        String[] numbers = intString.split(" ");
        StringBuilder result = new StringBuilder();

        for (String num : numbers) {
            int val = Integer.parseInt(num.strip());
            result.append(decimalToChar(val));
        }

        return result.toString();
    }
    public static String hexToString(String hexString) {
        String[] hexValues = hexString.split(" ");
        StringBuilder result = new StringBuilder();

        for (String hex : hexValues) {
            int decimal = Integer.parseInt(Conversion.convertHexToDecimal(hex.strip()));
            result.append(Representation.decimalToChar(decimal));
        }

        return result.toString();
    }
}

