import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();
        
        double[] rates = {0.02, 0.03, 0.04, 0.05};
        
        for (double rate : rates) {
            System.out.println("With an initial balance of $" + initialBalance + " at an interest rate of " + rate);
            double balance = initialBalance;
            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * rate);
                System.out.println("After year " + year + " balance is $" + balance);
            }
            System.out.println(); 
        }
        
        input.close();
    }
}
