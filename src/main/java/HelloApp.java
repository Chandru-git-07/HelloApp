public class HelloApp {
    public static void main(String[] args) {

        // If no arguments → default output
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all names with ", "
        String joinedNames = String.join(", ", args);

        // Print final output
        System.out.println("Hello, " + joinedNames);
    }
}