import java.util.Scanner;

public class TernaryOperator {
    public TernaryOperator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Annual Income: $");
        int income = scanner.nextInt();
        String className = income > 100000 ? "\"First Class\"" : "\"Economy Class\"";
        System.out.println("Assigned to : " + className + "! \nYou put annual income: $" + income);
    }
}
