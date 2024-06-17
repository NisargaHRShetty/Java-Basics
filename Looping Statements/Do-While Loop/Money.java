// Write a java program to withdraw 2000 rupees each time till it shows amount if insufficient

class Money{
    public static void main(String args[]){
        int totalAmount = 10595; // initial amount
        int withdrawAmount = 2000; //Amount to withdraw each time

        System.out.println("Starting withdrawal simulation with initial amount : " + totalAmount);
        // Use a do-while loop to ensure at least one withdrawal attempt
        do { 
            if (totalAmount >= withdrawAmount) {
            System.out.println("Withdrawing " + withdrawAmount + " rupees ");
            totalAmount -= withdrawAmount;
            System.out.println("Remaining amount :" +totalAmount);
        } else {
            break;
        }
            
        }while (true);

        System.out.println("Insufficient amount for withdrawal. Remaining amount: " + totalAmount);

    }
}