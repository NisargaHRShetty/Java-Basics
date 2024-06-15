//Logical operatiopns based on Boolean variables are ('&&', '||', '!')

import java.util.Scanner;

public class LogicalOperators{
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first boolean value (true/false): ");
    boolean boo1 = sc.nextBoolean();

     System.out.println("Enter second boolean value (true/false): ");
    boolean boo2 = sc.nextBoolean();

    boolean andResult = boo1 && boo2;
    boolean orResult = boo1 || boo2;
    boolean notResult1 = !boo1;
    boolean notResult2 = !boo2;
    
    System.out.println("results are:");
    System.out.println(boo1 + "&&" +boo2 +"=" +andResult);
    System.out.println(boo1 + "||" +boo2 +"=" +orResult);
    System.out.println("!" +boo1 +"=" +notResult1);
    System.out.println("!" +boo2 +"=" +notResult2);



    }
}