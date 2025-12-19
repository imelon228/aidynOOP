public class Veterinarian {
    private int vetID;
    private String name;
    private String specialization;
    private int experience;

    public Veterinarian(int vetID, String name, String specialization, int experience) {
        this.vetID = vetID;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }
    // default
    public Veterinarian() {
        this.vetID = 0;
        this.name = "Unknown";
        this.specialization = "Unknown";
        this.experience = 0;
    }
    // getters
    public int getVetID() {
        return vetID;
    }
    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }
    public int getExperience() {
        return experience;
    }

    // setters
    public void setVetID(int vetID) {
        this.vetID = vetID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean canTreat(Pet pet){
        return pet.getSpecies() == specialization;
    }
    public boolean isExperienced(){
        return experience>5;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "vetID=" + vetID +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience=" + experience +
                '}';
    }
}
