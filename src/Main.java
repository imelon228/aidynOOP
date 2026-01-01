import java.lang.reflect.Array;
import java.util.ArrayList; // Allows us to use ArrayList
import java.util.Scanner; // Allows us to read user input


public class Main{
    private static ArrayList<Pet> pets = new ArrayList<>();
    private static ArrayList<Owner> owns = new ArrayList<>();
    private static ArrayList<Veterinarian> vets = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {

        pets.add(new Pet(1, "Fari", "dog", 5));
        pets.add(new Pet(2, "Murka", "cat", 2));

        owns.add(new Owner(1, 304, 3, "Aidyn"));
        owns.add(new Owner(2, 228, 5, "Mary"));

        vets.add(new Veterinarian(1, "Cade", "dog", 5));
        vets.add(new Veterinarian(2, "Suzy", "elephant", 2));


        private static void displayMenu() {
            System.out.println("\n========================================");
            System.out.println("=== Veterinarian clinic ===");
            System.out.println("========================================");
            System.out.println("1. Add Pet");
            System.out.println("2. View All Pets");
            System.out.println("3. Add Owner");
            System.out.println("4. View All Owners");
            System.out.println("5. Add Veterinarian");
            System.out.println("6. View All Vets");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");
        }

// Menu loop - continues until user exits
        boolean running = true;
        while (running) {
            displayMenu(); // Show menu options
            int choice = scanner.nextInt(); // Read user's choice
            scanner.nextLine(); // IMPORTANT: consume leftover newline
            switch (choice) {
                case 1:
                    addMenuItem();
                    break;
                case 2:
                    viewAllMenuItems();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    viewAllCustomers();
                    break;
                case 5:
                    addOrder();
                    break;
                case 6:
                    viewAllOrders();
                    break;
                case 0:
                    System.out.println("\nGoodbye! "); 👋
                    running = false; // Exit loop
                    break;
                default:
                    System.out.println("\n Invalid choice!"); ❌
            }
            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine(); // Wait for user
            }
        }
        scanner.close(); // Clean up
    } // End of main method


        System.out.println();


    }

}