// Write a java program to check number is greater than or smaller than or equals to 10

import java.util.Scanner;

class Program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number");
        int num1 = sc.nextInt();

        System.out.println("Enter a second number");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal ");
        }
        else if(num1 > num2){
        System.out.println(num1 + " is greater than " + num2);
            }
            else{
                System.out.println(num1 + " is smaller than " + num2);
            }
        }
    }
