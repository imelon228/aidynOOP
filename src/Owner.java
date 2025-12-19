public class Owner {
    private int ownerID;
    private int phone;
    private int numberOfPets;
    private String name;

    public Owner(int ownerID, int phone, int numberOfPets, String name){
        this.ownerID = ownerID;
        this.phone = phone;
        this.numberOfPets = numberOfPets;
        this.name = name;
    }
    //default
    public Owner(){
        this.ownerID = 0;
        this.phone = 0;
        this.numberOfPets = 0;
        this.name = "Unknown";
    }

    // getters
    public int getOwnerID() {
        return ownerID;
    }
    public int getPhone() {
        return phone;
    }
    public int getNumberOfPets() {
        return numberOfPets;
    }
    public String getName() {
        return name;
    }

    // setters
    public void setOwnerID(int ownerID){
        this.ownerID = ownerID;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public void setNumberOfPets(int numberOfPets){
        this.numberOfPets = numberOfPets;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addPet(){
        numberOfPets++;
    }
    public boolean isFrequentClient(){
        return numberOfPets >= 3;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerID=" + ownerID +
                ", phone=" + phone +
                ", numberOfPets=" + numberOfPets +
                ", name='" + name + '\'' +
                '}';
    }
}
