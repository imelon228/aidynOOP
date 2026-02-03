package Entities;

public abstract class Treatment {
    protected int treatmentID;
    protected String treatmentName;
    protected double cost;
    protected boolean completed;

    public Treatment(int treatmentID, String treatmentName, double cost, boolean completed){
        setTreatmentID(treatmentID);
        setTreatmentName(treatmentName);
        setCost(cost);
        setCompleted(completed);
    }
    public void setTreatmentID(int treatmentID){
        if (treatmentID>0){
            this.treatmentID = treatmentID;
        } else {
            throw new IllegalArgumentException("Invalid ID");
        }
    } // for vetclinic_db

    public int getTreatmentID(){
        return treatmentID;
    }

    public void setTreatmentName(String treatmentName) {
        if (treatmentName == null || treatmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Treatment name cannot be empty");

        }
        this.treatmentName = treatmentName;
    }
    public String getTreatmentName(){
        return treatmentName;
    }
    public double getCost() {
        return cost;
    }

    public boolean getComplete(){
        return completed;
    }

    public void setCost(double cost) {
        if(cost>=0) this.cost = cost;
    }



    public void setCompleted(boolean completed) {
        if(completed != true && completed != false){
            throw new IllegalArgumentException("Logic Error");
            }
        else {
            this.completed = completed;
        }
    }



    public abstract void performTreatment();

    public abstract double calculateCost();

    public  void showDetails(){
        System.out.println("Treatment ID: " + treatmentID + "Treatment name: " + treatmentName + "\nDurations: ");
    }

    @Override
    public String toString() {
        return "Treatment ID: " + treatmentID + "Treatment name: "+treatmentName+ ", Cost: "+ cost +", Durations: " + " minutes" + ", Status: "+completed;
    }
}