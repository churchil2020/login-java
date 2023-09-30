package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

         // Declare the username and password variables
        try ( // Create a Scanner object to read user input
                Scanner scanner = new Scanner(System.in)) {
            String username, password;
            // Initialize the number of tries to 3
            int tries = 3;
            // Do-while loop to keep asking for username and password until the user enters the correct credentials or runs out of tries
            do {
                
                // Prompt the user for username and password
                System.out.println("Enter username: ");
                username = scanner.nextLine();
                
                System.out.println("Enter password: ");
                password = scanner.nextLine();
                
                // Print each character of the password as * while receiving it
                for (int i = 0; i < password.length(); i++) {
                    System.out.print("*");
                }
                System.out.println();
                
                // Check if the username and password are correct
                if (username.equals("user") && password.equals("password")) {
                    
                    // Login successful
                    System.out.println("Login successful!");
                    break;
                    
                } else {
                    
                    // Login failed
                    System.out.println("Login failed. Please try again.");
                    tries--;
                    
                }
                
            } while (tries > 0);
            // If the user runs out of tries, display an error message
            if (tries == 0) {
                System.out.println("You have run out of tries. Please try again later.");
            }
        }

    }

}
