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



// Menu loop - continues until user exits
        boolean running = true;
        while (running) {
            displayMenu(); // Show menu options
            int choice = scanner.nextInt(); // Read user's choice
            scanner.nextLine(); // IMPORTANT: consume leftover newline
            switch (choice) {
                case 1:
                    addPet();
                    break;
                case 2:
                    viewAllPets();
                    break;
                case 3:
                    addOwner();
                    break;
                case 4:
                    viewAllOwners();
                    break;
                case 5:
                    addVet();
                    break;
                case 6:
                    viewAllVets();
                    break;
                case 0:
                    System.out.println("\nGoodbye! ");
                    running = false; // Exit loop
                    break;
                default:
                    System.out.println("\n Invalid choice!");
            }
            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine(); // Wait for user
            }
        }
        scanner.close(); // Clean up
    } // End of main method
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

    private static void addPet() {
        System.out.println("\n--- ADD PET ---");
        // Ask for each field
        System.out.print("Enter pet ID: ");
        int ID = scanner.nextInt(); // Read INT
        System.out.print("Enter name: ");
        String name = scanner.nextLine(); // Read String
        scanner.nextLine(); // Consume newline
        System.out.print("Enter species: ");
        String species = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create new object with user's data
        Pet item = new Pet(ID, name, species, age);
        // Add to ArrayList
        pets.add(item);
        System.out.println("\n New pet added successfully!");
    }
    private static void addOwner() {
        System.out.println("\n--- ADD ONWER ---");
        // Ask for each field
        System.out.print("Enter owner ID: ");
        int ID = scanner.nextInt(); // Read INT
        System.out.print("Enter phone number: ");
        int phone = scanner.nextInt();
        System.out.print("Enter number of pets: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine(); // Read String
        scanner.nextLine(); // Consume newline

        // Create new object with user's data
        Owner item = new Owner(ID, phone, num, name);
        // Add to ArrayList
        owns.add(item);
        System.out.println("\n New owner added successfully!");
    }
    private static void addVet() {
        System.out.println("\n--- ADD VETERINARIAN ---");
        // Ask for each field
        System.out.print("Enter owner ID: ");
        int ID = scanner.nextInt(); // Read INT
        System.out.print("Enter vet name: ");
        String name = scanner.nextLine(); // Read string
        scanner.nextLine();
        System.out.print("Enter specialization: ");
        String specialty = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter experience: ");
        int exp = scanner.nextInt(); // Read double
        scanner.nextLine(); // Consume newline

        // Create new object with user's data
        Veterinarian item = new Veterinarian(ID, name, specialty, exp);
        // Add to ArrayList
        vets.add(item);
        System.out.println("\n New veterinarian added successfully!");
    }

    private static void viewAllPets(){
        System.out.println("========================");
        System.out.println("    ALL PETS");
        System.out.println("========================");

        if (pets.isEmpty()){
            System.out.println("No pets found");
            return;
        }

        System.out.println("Total pets: " + pets.size());
        System.out.println();

        for (int i=0;i< pets.size();i++){
            Pet pet = pets.get(i);
            System.out.println((i+1) + ". Pet ID: " + pet.getPetID() + "\nName: " + pet.getName());
            System.out.println("Age: " + pet.getPetAge());
            System.out.println("Species: " + pet.getSpecies());

            System.out.println("Life stage: " + pet.getLifeStage());
            System.out.println();
        }
    }
    private static void viewAllOwners(){
        System.out.println("========================");
        System.out.println("    ALL OWNERS");
        System.out.println("========================");

        if (owns.isEmpty()){
            System.out.println("No owners found");
            return;
        }

        System.out.println("Total owners: " + owns.size());
        System.out.println();

        for (int i = 0;i< owns.size();i++){
            Owner owner = owns.get(i);
            System.out.println((i+1) + ". Owner ID: " + owner.getOwnerID() + "\nName: " + owner.getName());
            System.out.println("Phone: " + owner.getPhone());
            System.out.println("Number of Pets: " + owner.getNumberOfPets());

            if (owner.isFrequentClient()){
                System.out.println("Frequent client");
            }
            System.out.println();
        }
    }
    private static void viewAllVets(){
        System.out.println("========================");
        System.out.println("    ALL VETERINARIANS");
        System.out.println("========================");

        if (vets.isEmpty()){
            System.out.println("No veterinarians found");
            return;
        }

        System.out.println("Total veterinarians: " + vets.size());
        System.out.println();

        for (int i = 0;i< vets.size();i++){
            Veterinarian veterinarian = vets.get(i);
            System.out.println((i+1) + ". Veterinarian ID:" + veterinarian.getVetID() + "\nName: " + veterinarian.getName());
            System.out.println("Specialization: " + veterinarian.getSpecialization());
            System.out.println("Experience: " + veterinarian.getExperience());

            if (veterinarian.isExperienced()){
                System.out.println("Experienced veterinarian");
            }
            System.out.println();
        }
    }

}
