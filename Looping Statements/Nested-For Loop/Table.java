//Multiplication table from 1 to 10

class Table{
    public static void main(String[] args) {
        
        int tableSize = 10;

        //outer loop for rows
        for(int i = 1; i<=tableSize; i++){
            for(int j=1; j<= tableSize; j++){
                int product = i*j;
                System.out.print(product + "\t"); // Use \t for tab spacing
            }
            //Move to the next line after each row
            System.out.println();
        }
    }
}