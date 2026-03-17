import java.awt.*;
public class HelloApp {
    public static void main(String[] args) {
        StringBuilder namesBuilder = new StringBuilder();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                namesBuilder.append(args[i]);
                // Only add a comma if it's NOT the last element
                if (i < args.length - 1) {
                    namesBuilder.append(", ");
                }
            }
        } else {
            namesBuilder.append("World");
        }

        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}