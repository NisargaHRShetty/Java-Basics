public class Sequence {
    public static void generateSequence(int limit) {
        for (int i = 0; i <= limit; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Sequence of numbers up to 10:");
        generateSequence(10);

         System.out.println("Sequence of numbers up to 5:");
        generateSequence(5);
    }
}