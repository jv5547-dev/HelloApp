package week5and6;

public class HelloApp {
    public static void main(String[] args) {
        // 1. Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // 2. String.join takes the delimiter and the array
            // It automatically places the comma BETWEEN elements only
            String names = String.join(", ", args);

            // 3. Display the final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}