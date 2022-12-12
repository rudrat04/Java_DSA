package rudra_assignment;

import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Principal: ");
        float principal = input.nextFloat();
        System.out.print("Please Enter Time: ");
        float time = input.nextFloat();
        System.out.print("Please Enter Rate: ");
        float rate = input.nextFloat();

        float Simple_Intrest = (principal * time * rate) / 100;
        System.out.println("Simple Intrest is: " +Simple_Intrest);
    }
}
