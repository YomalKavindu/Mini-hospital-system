package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display the hospital system menu
            System.out.println("\n ****MINI HOSPITAL SYSTEM****");
            System.out.println("Welcom User!");
            System.out.println("1. Patient Recordes");
            System.out.println("2. Emergency Queue");
            System.out.println("3. Treatment History");
            System.out.println("4. Patient Visit History");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");

            // Reas the user choice
            int choice = scanner.nextInt();

            //handle the choice
            switch (choice) {
                case 1:
                    System.out.println("Opening Patient Records...");
                    break;
                case 2:
                    System.out.println("Opening Emergency Queue...");
                    break;
                case 3:
                    System.out.println("Opening Treatment History...");
                    break;
                case 4:
                    System.out.println("Opening Patient Visit History...");
                    break;
                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again... ");
            }
        }

        scanner.close();

    }
}
