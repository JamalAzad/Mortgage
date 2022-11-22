import java.util.Scanner;

public class Magic {
    public Magic() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("Dividable by 5 and 3");
        } else if (number % 3 == 0) {
            System.out.println("Dividable by 3");
        } else if (number % 5 == 0) {
            System.out.println("Dividable by 5");
        } else {
            System.out.println("Not dividable by 5 or 3");
        }

    }
}
