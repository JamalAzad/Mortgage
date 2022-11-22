import java.util.Scanner;

public class WhileLoopInput {
    public WhileLoopInput() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println("Your input is: " + input);
            if (input.equals("quit")) {
                System.out.println("Bye Bye!!");
            }
        }

    }
}
