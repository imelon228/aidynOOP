public class Main{
    public static void main (String[] args) {
        System.out.println("=== Veterinarian clinic ===");
        System.out.println();

        Pet pet1 = new Pet(1, "Fari", "dog", 5);
        Pet pet2 = new Pet(2, "Madi", "cat", 2);

        Owner own1 = new Owner(1, 777, 3, "Aidyn");
        Owner own2 = new Owner(2, 228, 5, "Mary");

        Veterinarian vet1 = new Veterinarian(1, "Cade", "dog", 5);
        Veterinarian vet2 = new Veterinarian(2, "Stacy", "elephant", 3);


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