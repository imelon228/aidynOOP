public class Pet {
    private int petID;
    private String name;
    private String species;
    private int petAge;

    public Pet(int petID, String name, String species, int petAge){
        this.petID = petID;
        this.name = name;
        this.species = species;
        this.petAge = petAge;
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
        this.name = name;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setPetAge(int petAge){
        this.petAge = petAge;
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
        return "Pet{" +
                "petID=" + petID +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", petAge=" + petAge +
                '}';
    }
}
