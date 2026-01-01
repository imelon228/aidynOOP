import java.util.ArrayList; // Allows us to use ArrayList
import java.util.Scanner; // Allows us to read user input

public class Main{
    public static void main (String[] args) {
        System.out.println("=== Veterinarian clinic ===");
        System.out.println();

        Pet pet1 = new Pet(1, "Fari", "dog", 5);
        Pet pet2 = new Pet(2, "", "cat", 0);

        Owner own1 = new Owner(1, 0, 3, "");
        Owner own2 = new Owner(2, 228, 5, "Mary");

        Veterinarian vet1 = new Veterinarian(1, "Cade", "dog", 5);
        Veterinarian vet2 = new Veterinarian(2, "", "elephant", 1);


        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println();

        System.out.println(own1);
        System.out.println(own2);
        System.out.println();

        System.out.println(vet1);
        System.out.println(vet2);
        System.out.println();


    }

}