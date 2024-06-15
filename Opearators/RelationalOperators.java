//relational operators are ==, <=, >=, <, >

import java.util.Scanner;

class RelationalOperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fisrt number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

       System.out.println("Relational Operators are: ");
       System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
       System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
       System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
       System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
       System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
     System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
    }
}