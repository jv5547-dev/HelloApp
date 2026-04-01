public class HelloApp {
    public static void main(String[] args) {
        // 1. Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // 2. Use StringBuilder for efficient string construction
            StringBuilder nameBuilder = new StringBuilder();

            // 3. Enhanced for loop to append names and delimiters
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // 4. Remove the trailing delimiter (", ") using substring
            // Check length > 0 to avoid StringIndexOutOfBoundsException
            String finalNames = "";
            if (nameBuilder.length() > 0) {

                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // 5. Display the final greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}