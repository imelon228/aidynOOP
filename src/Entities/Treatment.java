package Entities;

public abstract class Treatment {
    protected String treatmentName;
    protected double cost;
    protected int duration;
    protected boolean completed;

    public Treatment(String treatmentName, double cost, int duration, boolean completed){
        setTreatmentName(treatmentName);
        setCost(cost);
        setDuration(duration);
        setCompleted(completed);
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

    public int getDuration() {
        return duration;
    }

    public boolean getComplete(){
        return completed;
    }

    public void setCost(double cost) {
        if(cost>=0) this.cost = cost;
    }

    public void setDuration(int duration) {
        if (duration>=0)this.duration = duration;
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
        System.out.println("Treatment name: " + treatmentName + "\nDurations: "+ duration + " minutes");
    }

    @Override
    public String toString() {
        return "Treatment name: "+treatmentName+ ", Cost: "+ cost +", Durations: " + duration + " minutes" + ", Status: "+completed;
    }
}