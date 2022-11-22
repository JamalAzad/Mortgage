import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchDemo {
    public SwitchDemo() {
    }

    public static void main(String[] args) {
        System.out.println("Enter # 1 for Admin OR # 2 for Moderator OR # 3 for Guest!");
        System.out.print("Number Only: ");

        try {
            Scanner scanner = new Scanner(System.in);
            int role = scanner.nextInt();
            switch (role) {
                case 1:
                    System.out.println("You are an Admin");
                    break;
                case 2:
                    System.out.println("You are a Moderator!");
                    break;
                case 3:
                    System.out.println("You are a guest!");
                    break;
                default:
                    System.out.println("Wrong Input! Enter number \"1\" or \"2\" or \"3\"");
            }
        } catch (InputMismatchException var3) {
            System.out.println("Error!!! Input is not an int value");
        }

    }
}
