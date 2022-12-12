package com.rudra;

import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // CELSIUS TO FARENHEIT
//        System.out.print("Please enter temp in Celsius: ");
//        float tempC= input.nextFloat();
//        float tempF=(tempC * 9/5)+32;
//        System.out.println(" The temp in Farenheit is: " +tempF);

        // FARENHEIT to CELSIUS
        System.out.print("Please enter temp in Farenheit: ");
        float tempF = input.nextFloat();
        float tempC = (tempF - 32) * 5/9;
        System.out.println("The temp in Celsius is: " +tempC);

    }
}
