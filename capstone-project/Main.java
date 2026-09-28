import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Pricipal: ");
        int principal = scanner.nextInt();
        System.out.print("What is your annual interest: ");
        double annualInterest = scanner.nextDouble();
        System.out.print("How many years would you like to pay back: "); 
        double years = scanner.nextInt();

        
        double monthlyInterestRate = (annualInterest / 100) / 12 ;
        double y = years * 12; 

        double monthlyPayment = principal * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), y)) / (Math.pow((1 + monthlyInterestRate), y) - 1));

        monthlyPayment = Math.round(monthlyPayment); 

        System.out.println("Your Mortgage is: $" + monthlyPayment);


    }
}
