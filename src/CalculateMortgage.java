import java.text.NumberFormat;
import java.util.Scanner;

public class CalculateMortgage {
    public CalculateMortgage() {
    }

    public static void main(String[] args) {
        int principal;
        float annualInterestRate;
        byte years;

        //Scanner scanner = new Scanner(System.in);

        principal=(int) scanNumber("Enter Principal ($1K - $1M) : ",1000,1_000_000);
//        while(true){
//            System.out.print("Enter Principal ($1K - $1M) : ");
//            principal = scanner.nextInt();
//            if (principal>=1000 && principal<=1_000_000)
//                break;
//            System.out.println("Re-enter a value between $1,000 and $1,000,000 !");
//        }

        annualInterestRate=(float) scanNumber("Annual Interest Rate: ",1,25);
//        while (true) {
//            System.out.print("Annual Interest Rate: ");
//            annualInterestRate = scanner.nextFloat();
//            if (annualInterestRate>0 && annualInterestRate<=25)
//                break;
//            System.out.println("Re-enter a value greater than 0 but less and equal to 25 !");
//        }

        years=(byte) scanNumber("Term of the loan in year: ",1,30);
//        while (true) {
//            System.out.print("Term of the loan in year:  ");
//            years = scanner.nextByte();
//            if(years>=1 && years<=30)
//                break;
//            System.out.println("Re-enter a value for year between 1 and 30");
//        }
        double monthlyPayment=calculateMortgage(principal,annualInterestRate,years);
        String payment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Your Monthly Payment will be : " + payment);
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
    public static double calculateMortgage(int principal, float annualInterestRate, byte years){
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENT;
        float numberOfPayments = years * MONTH_IN_YEAR;
        // Formula for calculating mortgage
        return (double)principal * ((double)monthlyInterestRate
                * Math.pow(1 + monthlyInterestRate, numberOfPayments - 1)
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
    }

}
