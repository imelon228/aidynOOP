package Entities;

public class Vaccination extends Treatment implements Performable {
    private String vaccineName;
    private int doseNumber;

    public Vaccination(double cost, int duration, boolean completed, String vaccineName, int doseNumber){
        super("Vaccination", cost, duration, completed);
        setVaccineName(vaccineName);
        setDoseNumber(doseNumber);
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public int getDoseNumber() {
        return doseNumber;
    }

    public void setVaccineName(String vaccineName) {
        if(vaccineName == null || vaccineName.trim().isEmpty()){
            throw new IllegalArgumentException("Not appropriate value");
        } else {
            this.vaccineName = vaccineName;
        }
    }

    public void setDoseNumber(int doseNumber) {
        if(doseNumber>=0){
            this.doseNumber = doseNumber;
        } else{
            throw new IllegalArgumentException("Number should be >= 0");
        }
    }



    @Override
    public void performTreatment() {
        System.out.println("Providing vaccine: " + vaccineName);
        completed = true;
    }

    @Override
    public double calculateCost() {
        return cost * doseNumber;
    }

    @Override
    public void check(){
        System.out.println("Check temperature and allergies before vaccination");
    }


    public void requiredVaccine(){
        System.out.println("Vaccine name: "+vaccineName+ "\nNumber of dose: "+ doseNumber);
    }

    public boolean needsBooster() {
        return doseNumber < 3;
    }


    @Override
    public String toString() {
        return super.toString() + ", Vaccine name: " + vaccineName + ", Number of dose: " + doseNumber;
    }
}