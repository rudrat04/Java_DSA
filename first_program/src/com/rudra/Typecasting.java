package com.rudra;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //TYPECASTING
//        int num = (int)(67.77f);
//        System.out.println(num);

        // AUTOMATIC TYPE PROMOTIONS IN EXPRESSIONS CASE 1
//        int a = 257;
//        byte b = (byte)(a); //257%256 = 1
//        System.out.println(b);

        // CASE 2
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;
//        System.out.println(d);

        //EXAMPLES
//        int number = 'A';
//        System.out.println(number);

        //EG 2
//        System.out.println(5*2.2);

        //EG 3
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        //Output is float + int - double = double
        System.out.println((f*b) + " " + (i/c)+ " " +(d-s));
        System.out.println(result);
    }
}
