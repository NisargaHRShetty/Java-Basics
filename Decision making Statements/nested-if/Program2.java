//categorize a person based age 

import java.util.Scanner;

class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Age");
        int age = sc.nextInt();
        if(age >= 0){
            if(age <= 12){
            System.out.println("You are a child");
        } else if (age <= 19){
        System.out.println("You are a teenager");
        } else if (age<=64) {
            System.out.println("You are a adult");
        } else {
            System.out.println("You are a senior");
        }
        } else {
            System.out.println("Invalid age entered");
        }
    }
}
