import java.util.Scanner;

public class NumberConverterNoLibrary {

    public static void convertDecimal(){
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Enter Decimal: ");
                int decimal = sc.nextInt();
                String binary = decimalToBinary(decimal);
                String octa = decimalToOctal(decimal);
                String hex = decimalToHexaDecimal(decimal);

                System.out.println("Binary: " + binary);
                System.out.println("Octal: " + octa);
                System.out.println("Hex: " + hex);

                break;
            }catch (Exception e){
                System.out.println("Invalid input try again!");
                sc.nextLine(); // Consume the invalid input
            }
        }
    }

    // Method to convert a decimal number to a binary string representation
    public static String decimalToBinary(int decimal) {
        // If the number is zero, return "0" as the binary representation
        if (decimal == 0) {
            return "0";
        }
        // StringBuilder to build the binary string
        StringBuilder binary = new StringBuilder();
        // Loop to divide the number by 2 and collect the remainders
        while (decimal > 0) {
            // Prepend the remainder to the binary string
            binary.insert(0, decimal % 2);
            // Update the decimal number by dividing it by 2
            decimal = decimal / 2;
        }
        // Return the final binary string
        return binary.toString();
    }

    // Method to convert a decimal number to an octal string representation
    public static String decimalToOctal(int decimal) {
        // If the number is zero, return "0" as the octal representation
        if (decimal == 0) {
            return "0";
        }
        // StringBuilder to build the octal string
        StringBuilder octal = new StringBuilder();
        // Loop to divide the number by 8 and collect the remainders
        while (decimal > 0) {
            // Prepend the remainder to the octal string
            octal.insert(0, decimal % 8);
            // Update the decimal number by dividing it by 8
            decimal = decimal / 8;
        }
        // Return the final octal string
        return octal.toString();
    }

    // Method to convert a decimal number to a hexadecimal string representation
    public static String decimalToHexaDecimal(int decimal) {
        // If the number is zero, return "0" as the hexadecimal representation
        if (decimal == 0) {
            return "0";
        }
        // StringBuilder to build the hexadecimal string
        StringBuilder hexadecimal = new StringBuilder();
        // Array to map remainder values to hexadecimal characters
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        // Loop to divide the number by 16 and collect the remainders
        while (decimal > 0) {
            // Prepend the corresponding hex character to the hexadecimal string
            hexadecimal.insert(0, hexChars[decimal % 16]);
            // Update the decimal number by dividing it by 16
            decimal = decimal / 16;
        }
        // Return the final hexadecimal string
        return hexadecimal.toString();
    }
}
