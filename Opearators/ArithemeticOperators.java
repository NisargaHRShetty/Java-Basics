// Arithmetic operators in java are +, -, *, /, %

import java.util.Scanner;

public class ArithemeticOperators {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

         System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1-num2;
        int mul = num1*num2;
        float div = num1/num2;
        int modulus = num1 % num2;
      

        System.out.println("Addition :"+ sum);
        System.out.println("Subtraction :"+ diff);
        System.out.println("Multiplication :"+ mul);
        System.out.println("Division :"+ div);
        System.out.println("Modulus :"+ modulus);
        
    }
}