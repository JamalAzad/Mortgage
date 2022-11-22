import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public Mortgage() {
    }

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal;
        float annualInterestRate;
        int years;
        float monthlyInterestRate;
        int numberOfPayments;

                Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter Principal ($1K - $1M) : ");
        principal = scanner.nextInt();
        if (principal>=1000 && principal<=1_000_000)
            break;
        System.out.println("Re-enter a value between $1,000 and $1,000,000 !");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate>0 && annualInterestRate<=25) {
                monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENT;
                break;
            }
            System.out.println("Re-enter a value greater than 0 but less and equal to 25 !");
        }
        while (true) {
            System.out.print("Term of the loan in year:  ");
            years = scanner.nextInt();
            if(years>=1 && years<=30) {
                numberOfPayments = years * MONTH_IN_YEAR;
                break;
            }
            System.out.println("Re-enter a value for year between 1 and 30");
        }
        double monthlyPayment = (double)principal * ((double)monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments - 1) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        String payment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Your Monthly Payment will be : " + payment);
    }
}
