package Entities;

public class Pet {
    private int petID;
    private String name;
    private String species;
    private int petAge;

    public Pet(int petID, String name, String species, int petAge){
        this.petID = petID;
        setName(name);
        this.species = species;
        setPetAge(petAge);
    }
    // default
    public Pet(){
        this.petID = 0;
        this.name = "Unknown";
        this.species = "Unknown";
        this.petAge = 0;
    }

    // getters
    public int getPetID() {
        return petID;
    }
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public int getPetAge() {
        return petAge;
    }

    // setters
    public void setPetID(int petID){
        this.petID = petID;
    }
    public void setName(String name){
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Warning: Name cannot be empty! pet" + petID);
        }
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setPetAge(int petAge){
        if (petAge > 0){
            this.petAge = petAge;
        } else {
            System.out.println("Incorrect age of pet" + petID);
        }
    }

    public boolean isYoung(){
        return petAge < 3;
    }
    public String getLifeStage(){
        if (petAge < 3){
            return "Young";
        }
        else if(petAge > 3 && petAge < 6){
            return "Adult";
        }
        else {
            return "Old";
        }
    }

    @Override
    public String toString() {
        return "Entities.Pet{" +
                "petID=" + petID +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", petAge=" + petAge +
                '}';
    }
}
