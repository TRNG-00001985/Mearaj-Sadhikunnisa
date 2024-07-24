package code;

import java.util.Scanner;

public class HardcodedLogin {
    private static String storedUsername = null;
    private static String storedPassword = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter a username: ");
                    storedUsername = scanner.nextLine();
                    System.out.print("Enter a password: ");
                    storedPassword = scanner.nextLine();
                    System.out.println("Signup successful! You can now log in.");
                    break;
                case 2:
                    if (storedUsername == null || storedPassword == null) {
                        System.out.println("No user found. Please sign up first.");
                        break;
                    }
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();
                    
                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        System.out.println("Login successful! Welcome, " + username + "!");
                    } else {
                        System.out.println("Incorrect username or password. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Thankyou for logging in");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
