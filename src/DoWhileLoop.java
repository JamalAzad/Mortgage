import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            System.out.print("Input: ");
            input= scanner.next().toLowerCase();
            System.out.println("Your input is: " +input);
        } while (!input.equals("quit"));
        System.out.println("Bye Bye!!");
    }
}

