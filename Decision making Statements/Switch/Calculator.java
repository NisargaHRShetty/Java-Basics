// calculator Program

import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter a second number");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter Operator (+, -, *, /, %)");
        char op = sc.next().charAt(0);

        double result;

        switch (op){
            case '+':
                result = num1 + num2;
                System.out.println("The result of " +num1 + " + " + num2 + " is " +result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result of " +num1 + " - " + num2 + " is " +result);
                break;
            
            case '*':
                result = num1 * num2;
                System.out.println("The result of " +num1 + " * " + num2 + " is " +result);
                break;

            case '/':
                if(num2 != 0){
                result = num1 / num2;
                System.out.println("The result of " +num1 + " / " + num2 + " is " +result);
                } else {
                    System.out.println("Division by zero error");
                }
                break;

            case '%':
                 if(num2 != 0){
                result = num1 % num2;
                System.out.println("The result of " +num1 + " % " + num2 + " is " +result);
                } else {
                    System.out.println("Division by zero error");
                }
                break;

            default:
                System.out.println("Invalid operator entered");
                break;
        }
        
    }
}