// Write a java program to check number is multiple of 3 or not

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

       
        if (n % 3 == 0) {
            System.out.println("The number " + n + " is multiple of 3.");
        } else {
            System.out.println("The number " + n + " is not a multiple of 3.");
        }
    }
}
