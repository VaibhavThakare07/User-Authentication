import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthenticationSystem {

    private static Map<String, String> userCredentials = new HashMap<>();

    public static void main(String[] args) {
        // Dummy user data for demonstration purposes
        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginUser(scanner);
                    break;
                case 2:
                    System.out.println("Exiting the authentication system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (validateCredentials(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username And password. Please try again.");
        }
    }

    private static boolean validateCredentials(String username, String password) {
        // In a real-world scenario, you would use secure methods like hashing for passwords
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }
}
