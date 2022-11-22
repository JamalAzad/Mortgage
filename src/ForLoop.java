public class ForLoop {
    public ForLoop() {
    }

    public static void main(String[] args) {
        System.out.println("Starting of Incremental loop");

        int i;
        for(i = 0; i < 5; ++i) {
            System.out.println("Hello World! Index # " + i);
        }

        System.out.println("Loop break to decremental values  ");

        for(i = 5; i > 0; --i) {
            System.out.println("Hello World! Index # " + i);
        }

    }
}
