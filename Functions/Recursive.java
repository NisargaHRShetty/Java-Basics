// Recursion example - Fibonacci

public class Recursive {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fibonacc number at position " + n + " is " + fibanacci(n));

    }

    public static int fibanacci(int n) {
        if (n <=1 ) {
            return n;
        }
        return (fibanacci( n - 1) + fibanacci( n - 2));
    }
}