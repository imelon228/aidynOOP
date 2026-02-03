package menu;

import Entities.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class ClinicMenu implements Menu {

    private static ArrayList<Treatment> allTreatment = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void run(){
        //allTreatment.add(new Surgery(100,30,false,"General",2));
        //allTreatment.add(new Vaccination(200,60,true,"aspirin", 2));


        boolean running = true;
        while(running){
            displayMenu();
            try {
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSurgery();
                    break;
                case 2:
                    viewSurgery();
                    break;
                case 3:
                    addVaccination();
                    break;
                case 4:
                    viewVaccination();
                    break;
                case 5:
                    demonstratePolymorphism();
                    break;
                case 6:
                    viewAllTreatment();
                    break;
                case 0:
                    System.out.println("\n Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\n Invalid choice!");
                }
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
            if (running){
                System.out.println("\n Press Enter to continue...");
                scanner.nextLine();
            }
        }
        scanner.close();


    }

    private static void addSurgery() {
        try {
            System.out.println("\n---ADD SURGERY---");

            System.out.println("Enter treatment ID: ");
            int treatmentID = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter surgery cost: ");
            double cost = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter surgery status (true or false): ");
            boolean completed = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Enter anesthesia type: ");
            String anesthesiaType = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Enter risk level: ");
            int riskLevel = scanner.nextInt();
            scanner.nextLine();

            Treatment treatment = new Surgery(treatmentID, cost, completed, anesthesiaType, riskLevel);
            allTreatment.add(treatment);

            System.out.println("\n Surgery added successfully!");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addVaccination(){
        System.out.println("\n---ADD VACCINATION---");
        try {

            System.out.println("Enter treatment ID: ");
            int treatmentID = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter vaccination cost: ");
            double cost = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter vaccination status (true or false): ");
            boolean completed = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Enter vaccination name: ");
            String vaccineName = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Enter number of dose: ");
            int doseNumber = scanner.nextInt();
            scanner.nextLine();

            Treatment treatment = new Vaccination(treatmentID, cost, completed, vaccineName, doseNumber);
            allTreatment.add(treatment);

            System.out.println("\n Vaccination added successfully!");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    private static void viewSurgery() {
        try {
            System.out.println("================================");
            System.out.println("          Surgery only");
            System.out.println("================================");

            int surgeryCount = 0;
            for (Treatment s : allTreatment) {
                if (s instanceof Surgery) {
                    Surgery surgery = (Surgery) s;
                    surgeryCount++;

                    System.out.println(surgeryCount + "." + surgery.getTreatmentID());
                    System.out.println("   Treatment name: " + "Surgery");
                    System.out.println("   Surgery cost: " + surgery.getCost());
                    System.out.println("   Anesthesia type: " + surgery.getAnesthesiaType());
                    System.out.println("   Risk level: " + surgery.getRiskLevel());

                    surgery.check();

                    surgery.howRisky();

                    System.out.println();
                }
            }
            if (surgeryCount == 0) {
                System.out.println("No surgery found.");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewVaccination() {
        try {
            System.out.println("================================");
            System.out.println("          Vaccination only");
            System.out.println("================================");

            int vaccinationCount = 0;
            for (Treatment s : allTreatment) {
                if (s instanceof Vaccination) {
                    Vaccination vaccination = (Vaccination) s;
                    vaccinationCount++;

                    System.out.println(vaccinationCount + "." + vaccination.getTreatmentID());
                    System.out.println("   Treatment name: " + "Vaccination");
                    System.out.println("   Surgery cost: " + vaccination.getCost());
                    System.out.println("   Vaccine name: " + vaccination.getVaccineName());
                    System.out.println("   Number of dose: " + vaccination.getDoseNumber());

                    vaccination.check();

                    if (vaccination.needsBooster()) {
                        System.out.println("Vaccine need a booster");
                    }

                    System.out.println();
                }
            }
            if (vaccinationCount == 0) {
                System.out.println("No vaccination found.");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewAllTreatment() {
        try {
            System.out.println("\n==============================");
            System.out.println("     ALL TREATMENT(POLYMORPHIC LIST)");
            System.out.println("==============================");

            if (allTreatment.isEmpty()) {
                System.out.println("No treatment found.");
                return;
            }

            System.out.println("Total treatment: " + allTreatment.size());
            System.out.println();

            for (int i = 0; i < allTreatment.size(); i++) {
                Treatment s = allTreatment.get(i);

                System.out.println((i + 1) + "." + s);
                if (s instanceof Surgery) {
                    Surgery surgery = (Surgery) s;
                    surgery.howRisky();
                } else if (s instanceof Vaccination) {
                    Vaccination vaccination = (Vaccination) s;
                    if (vaccination.needsBooster()) {
                        System.out.println("Vaccine need a booster");
                    }
                }

                System.out.println();

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void demonstratePolymorphism(){
        System.out.println("\n========================================");
        System.out.println("   POLYMORPHISM DEMONSTRATION");
        System.out.println("========================================");
        System.out.println();

        for(Treatment s: allTreatment){
            s.performTreatment();
        }

        System.out.println();
        System.out.println("This is POLYMORPHISM in action!");
    }

    @Override
    public void displayMenu(){

        System.out.println("===== VET CLINIC SYSTEM =====");
        System.out.println("1. Add Surgery");
        System.out.println("2. View Surgery");
        System.out.println("3. Add Vaccination");
        System.out.println("4. View Vaccination");
        System.out.println("5. Show Polymorphism");
        System.out.println("6. View All Treatment");
        System.out.println("0. Exit");
        System.out.println("==============================");
        System.out.println("Enter choice: ");
    }



}