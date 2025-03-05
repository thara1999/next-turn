package prac;

import java.io.Console;

public class ConsoleEx {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        String username = console.readLine("Enter your username: ");
        char[] passwordChars = console.readPassword("Enter your password: ");
        String password = new String(passwordChars); // Convert char[] to String

        System.out.println("Username: " + username);
        System.out.println("Password entered securely!"+" "+password);
    }

    
}
