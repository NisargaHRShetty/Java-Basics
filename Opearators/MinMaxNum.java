class MinMaxNum{
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 40;
        int num3 = 30;
        int num4 = 50;

        int minNum = num1;

        if(num2 < minNum){
            minNum = num2;
         }

        if(num3 < minNum){
            minNum = num3;
         }

         if(num4 < minNum){
            minNum = num4;
         }

        int maxNum = num1;
         if(num2 > maxNum){
            maxNum = num2;
         }

        if(num3 > maxNum){
            maxNum = num3;
         }

         if(num4 > maxNum){
            maxNum = num4;
         }

        System.out.println("Given Number are : "+num1 + "," +num2 + ","+num3 + ","+num4);
        System.out.println("Minimun Number : " +minNum);
        System.out.println("Minimun Number : " +maxNum);
        
    }
}