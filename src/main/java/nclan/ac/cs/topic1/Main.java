package nclan.ac.cs.topic1;

import javafx.scene.control.Alert;

public class Main {

    public static void main(String[] args){


    runASCII();
}

    private static void runBitwiseLogic()
    {


        try
        {
            String result = BitwiseLogic.binarySub("101101", "1111111");
            System.out.println("Binary sub Result: " + result);
        }
        catch(Exception e)
        {
            System.err.println("Binary sub failed! " +  e.getMessage());
        }



    try
    {
        String result = BitwiseLogic.binaryAdd("101101", "1111111");
        System.out.println("Binary Result: " + result);
    }
    catch(Exception e)
    {
        System.err.println("Binary add failed! " +  e.getMessage());
    }





    try
    {
        String result = BitwiseLogic.hexAdd("AB12", "B123");
        System.out.println("Add Result: " + result);
    }
    catch(Exception e)
    {
        System.err.println("Hex add failed! " +  e.getMessage());
    }


    try
    {
        String result = BitwiseLogic.hexSub("AB12", "B123");
        System.out.println("Subtract Result: " + result);
    }
    catch(Exception e)
    {
        System.err.println("Hex sub failed! " +  e.getMessage());
    }


    try
    {
        String result = BitwiseLogic.binaryAND("10101010", "11110000");
        System.out.println("AND Result: " + BitwiseLogic.padLeftBinary(result));
    }
    catch(Exception e)
    {
        System.err.println("binaryAND failed! " +  e.getMessage());
    }

    try
    {
        String result = BitwiseLogic.binaryOR("111001", "101");
        System.out.println("OR Result: " + BitwiseLogic.padLeftBinary(result));
    }
    catch(Exception e)
    {
        System.err.println("binaryOR failed! " +  e.getMessage());
    }

    try
    {
        String result = BitwiseLogic.binaryXOR("10101", "11111");
        System.out.println("XOR Result: " + BitwiseLogic.padLeftBinary(result));
    }
    catch(Exception e)
    {
        System.err.println("binaryOR failed! " +  e.getMessage());
    }


    }
public static void runASCII()
{
    System.out.println(Representation.stringToASCII("Hi"));
    System.out.println(Representation.stringToASCII("Hello!"));
    System.out.println(Representation.stringToASCII("$54321"));

    System.out.println(Representation.stringToHex("Hi"));
    System.out.println(Representation.stringToHex("Hello!"));
    System.out.println(Representation.stringToHex("$54321"));

    System.out.println(Representation.decimalToChar(65));
    System.out.println(Representation.decimalToChar(70));
    System.out.println(Representation.decimalToChar(44));


}
public static void showError(String message)
{
    new Alert (Alert.AlertType.ERROR, message).showAndWait();
}


}




