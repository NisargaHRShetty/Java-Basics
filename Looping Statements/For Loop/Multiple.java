//Write a java program to print multiple of 5 upto 100

class Multiple{
    public static void main(String args[]){
        System.out.println("Multuiple of 5 from 1 to 100 are: ");

        for(int i=1; i<=100 ; i++){
            if(i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}