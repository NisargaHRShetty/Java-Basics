// Unary operators are +,-, ++, --, !

import java.util.Scanner;

public class UnaryOperators{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt(); //a value returned by sc.nextInt() is stored in the variable num

        System.out.println("Number:" +num);

        //unary operators
        System.out.println("Unary Operations");

        System.out.println("++num = " + (++num)); //Pre increment

        //Reset num into iniial value for demonstration purpose
        num = sc.nextInt();

        System.out.println("--num = " + (--num)); //Pre decrement

        //Reset num into iniial value for demonstration purpose
        num = sc.nextInt();

        System.out.println("num++ = " + (num++)); //Post increment
        System.out.println("After post increment :" + num);

        //Reset num into iniial value for demonstration purpose
        num = sc.nextInt();

        System.out.println("num-- = " + (num--)); //Post decrement
        System.out.println("After post decrement :" + num);

        //Reset num into iniial value for demonstration purpose
        num = sc.nextInt();

        System.out.println("+num = " + (+num)); //Unary positive operator

        //Reset num into iniial value for demonstration purpose
        num = sc.nextInt();

        System.out.println("-num = " + (-num)); //unary negative oerator

        //Reset num into iniial value for demonstration purpose
        num = sc.nextInt();

        boolean boo1 = (num > 0);
        System.err.println("!" + boo1 + " = " + (!boo1));

    }
    }