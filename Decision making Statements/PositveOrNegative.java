// write a java program to check a number is positive or negative

import java.util.Scanner;

public class PositveOrNegative {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

       
        if (n > 0) {
            System.out.println("The number " + n + " is Positive");
        } else if(n < 0){
            System.out.println("The number " + n + " is Negative");
        }
        else{
            System.out.println("The number is Zero");
        }
    }
}
