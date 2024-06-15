// assignment operator is  "="
import java.util.Scanner;

public class AssignmentOperators{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt(); //a value returned by sc.nextInt() is stored in the variable num

        System.out.println("Number:" +num);

        //Using assignment operator
        int result = num;
        System.out.println("Result after '=' oerator:" +result);

        //using compund assignment operator +=
        result += 5;
        System.out.println("Result after '+=' oerator:" +result);

        //using compund assignment operator -=
        result -= 5;
        System.out.println("Result after '-=' oerator:" +result);

        //using compund assignment operator *=
        result *= 5;
        System.out.println("Result after '*=' oerator:" +result);

        //using compund assignment operator /=
        result /= 5;
        System.out.println("Result after '/=' oerator:" +result);

        //using compund assignment operator %=
        result %= 5;
        System.out.println("Result after '%=' oerator:" +result);

    }
}
