// Ternary = condition ? if true : if false
//Checking Number is even or odd

import java.util.Scanner;

class TernaryOperators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + result);
    }
}