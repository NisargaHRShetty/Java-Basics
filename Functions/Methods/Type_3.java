// Type 3 - Method which is going to return some value back to the caller and also accept some value from the caller

class SquareDemo {
    int findSquare (int num) {
       // int num = 20;
        int sq = num * num;
        //System.out.println("Sqaure :" + sq);
        return sq;
    }
}

class Type_3 {
    public static void main(String[] args) {
        SquareDemo t1 = new SquareDemo ();
        int res = t1.findSquare(20);
        System.out.println("Square :" + res);
        //t1.findSquare();
    }
}