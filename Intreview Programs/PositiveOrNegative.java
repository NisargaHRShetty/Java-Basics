// write a java program to check a number is positive or negative

import java.util.Scanner;

public class PositiveOrNegative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is positive");
        }
        else if(num < 0){
            System.out.println(num + " is negative");
        }
        else{
            System.out.println("Number is Zero");
        }
        }
    }

