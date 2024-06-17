// Write a java program to withdraw 2000 rupees each time till it shows amount if insufficient

class Money{
    public static void main(String args[]){
        int totalAmount = 10595; // initial amount
        int withdrawAmount = 2000; //Amount to withdraw each time

        System.out.println("Starting withdrawal simulation with initial amount : " + totalAmount);

        while (totalAmount >= withdrawAmount) {
            System.out.println("Withdrawing " + withdrawAmount + " rupees ");
            totalAmount -= withdrawAmount;
            System.out.println("Remaining amount :" +totalAmount);
        }

        System.out.println("Insufficient amount for withdrawal. Remaining amount: " + totalAmount);

    }
}