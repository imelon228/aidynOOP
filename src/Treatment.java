public class Treatment {
    protected int treatmentID;
    protected double cost;
    protected int duration;
    protected boolean completed;

    public Treatment(int treatmentID, double cost, int duration, boolean completed){
        this.treatmentID=treatmentID;
        this.cost=cost;
        this.duration=duration;
        this.completed=completed;
    }

    public int getTreatmentID() {
        return treatmentID;
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

    public void setTreatmentName(String treatmentName) {
        this.treatmentID = treatmentID;
    }

    public void setCost(double cost) {
        if(cost>=0) this.cost = cost;
    }

    public void setDuration(int duration) {
        if (duration>=0)this.duration = duration;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }



    public void performTreatment(){
        System.out.println("Treatment number: " + treatmentID);
    }

    public double calculateCost() {
        return cost;
    }

    public void showDetails(){
        System.out.println("Treatment ID: " + treatmentID + "\nDurations: "+ duration + " minutes");
    }

    @Override
    public String toString() {
        return "Treatment ID: "+treatmentID+ ", Cost: "+ cost +", Durations: " + duration + " minutes" + ", Status: "+completed;
    }
}