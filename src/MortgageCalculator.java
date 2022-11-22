import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public MortgageCalculator() {
    }

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal Amount:  ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENT;
        System.out.print("Term of the loan in year:  ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTH_IN_YEAR;
        double monthlyPayment = (double)principal * ((double)monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments - 1) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        String payment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Your Monthly Payment will be : " + payment);
    }
}
