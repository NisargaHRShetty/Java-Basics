// Write a java program to check number is even or Odd

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

       
        if (n % 2 == 0) {
            System.out.println("The number " + n + " is even.");
        } else {
            System.out.println("The number " + n + " is odd.");
        }
    }
}
