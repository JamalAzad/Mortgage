import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageSchedule {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public MortgageSchedule() {
    }

    public static void main(String[] args) {
        int principal=(int) scanNumber("Enter Principal ($1K - $1M) : ",1000,1_000_000);
        short annualInterestRate=(short) scanNumber("Annual Interest Rate: ",1,25);
        byte years=(byte) scanNumber("Term of the loan in year: ",1,30);

        printMortgage(principal, annualInterestRate, years);

        printPaymentSchedule(principal, annualInterestRate, years);
    }

    private static void printMortgage(int principal, short annualInterestRate, byte years) {
        double monthlyPayment=calculateMortgage(principal, annualInterestRate, years);
        String payment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("_________");
        System.out.println("Your Monthly Payment will be : " + payment);
    }

    private static void printPaymentSchedule(int principal, short annualInterestRate, byte years) {
        System.out.println();
        System.out.println("Payments Schedule");
        System.out.println("_________________");
        for(short month = 1; month<= years *MONTH_IN_YEAR; month++){
         double balance=   calculateBalance(principal, annualInterestRate, years,month);
            System.out.println("Month# "+month+" "+NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double scanNumber(String message, double min, double max)
    {
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(message);
            value = scanner.nextFloat();
            if (value>=min && value<=max)
                break;
            System.out.println("Re-enter a value between "+min +" and " +max +"!");
        }
        return value;
    }
    public static double calculateBalance(
            int principal,float annualInterestRate,
            byte years, short numberOfPaymentsMade){
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENT;
        float numberOfPayments = years * MONTH_IN_YEAR;
        double balance= principal*(Math.pow(1+monthlyInterestRate,numberOfPayments)-Math.pow(1+monthlyInterestRate,numberOfPaymentsMade))
                /(Math.pow(1+monthlyInterestRate,numberOfPayments)-1);
        return balance;

    }
    public static double calculateMortgage(int principal, float annualInterestRate, byte years){
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENT;
        float numberOfPayments = years * MONTH_IN_YEAR;
        // Formula for calculating mortgage
        return (double)principal * ((double)monthlyInterestRate
                * Math.pow(1 + monthlyInterestRate, numberOfPayments - 1)
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
    }

}
