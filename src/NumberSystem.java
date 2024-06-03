/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author darwin
 */
public class NumberSystem {
    static Scanner sc = new Scanner(System.in);

    public static void binaryToDecimal(){
        System.out.print("Enter Binary: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);

        System.out.println(decimal);
    }

    public static void binaryToOctal(){
        System.out.print("Enter Binary: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);

        System.out.println(octal);
    }

    public static void binaryToHexa(){
        System.out.print("Enter Binary: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        String hexa = Integer.toHexString(decimal);

        System.out.println(hexa);
    }

    public static void octalToBinary(){
        System.out.print("Enter Octal: ");
        String octal = sc.next();
        int decimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(decimal);

        System.out.println(binary);
    }

    public static void octalToDecimal(){
        System.out.print("Enter Octal: ");
        String octal = sc.next();
        int decimal = Integer.parseInt(octal, 8);

        System.out.println(decimal);
    }

    public static void octalToHexa(){
        System.out.print("Enter Octal: ");
        String octal = sc.next();
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal);

        System.out.println(hex);
    }

    public static void decimalToBinary(){
        System.out.print("Enter a Number: ");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);

        System.out.println(binary);
    }

    public static void decimalToOctal(){
        System.out.print("Enter a Number: ");
        int decimal = sc.nextInt();
        String octal = Integer.toOctalString(decimal);

        System.out.println(octal);
    }

    public static void decimalToHexa(){
        System.out.print("Enter a number");
        int decimal = sc.nextInt();
        String hexa = Integer.toHexString(decimal);

        System.out.println(hexa);
    }

    public static void hexaToDecimal(){
        System.out.print("Enter a Number");
        String hexa = sc.next();
        int decimal = Integer.parseInt(hexa, 16);

        System.out.println(decimal);
    }

    public static void hexaToBinary(){
        System.out.print("Enter Hexadecimal");
        String hexa = sc.next();
        int decimal = Integer.parseInt(hexa, 16);
        String binary = Integer.toBinaryString(decimal);

        System.out.println(binary);
    }

    public static void hexaToOctal(){
        System.out.print("Enter Hexadecimal: ");
        String hexa = sc.next();
        int decimal = Integer.parseInt(hexa, 16);
        String octal = Integer.toOctalString(decimal);

        System.out.println(octal);
    }
}
