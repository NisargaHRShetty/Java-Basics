// Type 4 - Method which is going to return some value back to the caller without taking any value from the caller

class SquareDemo {
    int findSquare () {
        int num = 20;
        int sq = num * num;
        //System.out.println("Sqaure :" + sq);
        return sq;
    }
}

class Type_4 {
    public static void main(String[] args) {
        SquareDemo t1 = new SquareDemo ();
        int res = t1.findSquare();
        System.out.println("Square :" + res);
        //t1.findSquare();
    }
}