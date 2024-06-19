// Type 2 - Which does not return any value but it will accept some value from caller (argument).

class SquareDemo {
    void findSquare (int num) {
        //int num = 20;
        int sq = num * num;
        System.out.println("Sqaure :" + sq);
    }
}

class Type_2 {
    public static void main(String[] args) {
        SquareDemo t1 = new SquareDemo ();
        t1.findSquare(20);
    }
}