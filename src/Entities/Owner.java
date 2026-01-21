package Entities;

public class Owner {
    private int ownerID;
    private int phone;
    private int numberOfPets;
    private String name;

    public Owner(int ownerID, int phone, int numberOfPets, String name){
        this.ownerID = ownerID;
        setPhone(phone);
        this.numberOfPets = numberOfPets;
        setName(name);
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
        if (phone <= 0) {
            System.out.println("Invalid phone number of owner" + ownerID);
            this.phone =0;
        } else {
            this.phone = phone;
        }
    }
    public void setNumberOfPets(int numberOfPets){
        this.numberOfPets = numberOfPets;
    }
    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Warning: Name cannot be empty! owner" + ownerID);
        }
    }

    public void addPet(){
        numberOfPets++;
    }
    public boolean isFrequentClient(){
        return numberOfPets >= 3;
    }

    @Override
    public String toString() {
        return "Entities.Owner{" +
                "ownerID=" + ownerID +
                ", phone=" + phone +
                ", numberOfPets=" + numberOfPets +
                ", name='" + name + '\'' +
                '}';
    }
}
