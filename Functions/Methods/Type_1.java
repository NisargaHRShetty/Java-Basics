// Type 1 - Which does not return any value and also not going to accept any argument.

class SquareDemo {
    void findSquare () {
        int num = 20;
        int sq = num * num;
        System.out.println("Sqaure :" + sq);
    }
}

class Type_1 {
    public static void main(String[] args) {
        SquareDemo t1 = new SquareDemo ();
        t1.findSquare();
    }
}