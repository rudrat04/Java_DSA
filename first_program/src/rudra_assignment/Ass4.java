package rudra_assignment;

import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

        System.out.print("Enter Operator: ");
        char opr;
        opr=input.next().charAt(0);

        double operator

        if(opr=="+"){
            int sum = num1 + num2;
            System.out.println("Addition of num1 and num2: " +sum);
        }

        if(Operator=="-"){
            int diff = num1 - num2;
            System.out.println("Diff of num1 and num2: " +diff);
        }

       if(Operator=="*"){
            int product = num1 * num2;
            System.out.println("Product of num1 and num2: " +product);
        }

        if(Operator=="/"){
            int div = num1 / num2;
            System.out.println("Div of num1 and num2: " +div);
        }
    }
}
