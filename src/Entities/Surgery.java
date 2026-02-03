package Entities;

import exception.InvalidInputException;

public class Surgery extends Treatment implements Performable{
    private String anesthesiaType;
    private int riskLevel;

    public Surgery(int treatmentID, double cost, boolean completed, String anesthesiaType, int riskLevel){
        super(treatmentID, "Surgery", cost, completed);
        setAnesthesiaType(anesthesiaType);
        setRiskLevel(riskLevel);
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public String getAnesthesiaType() {
        return anesthesiaType;
    }

    public void setRiskLevel(int riskLevel) {
        if(riskLevel>=0){
            this.riskLevel = riskLevel;
        } else {
            throw new IllegalArgumentException("Number should be >= 0");

        }
    }
    // Then catch it:


    public void setAnesthesiaType(String anesthesiaType) {
        if(anesthesiaType == null || anesthesiaType.trim().isEmpty()){
            throw new IllegalArgumentException("Not appropriate value");
        } else {
            this.anesthesiaType = anesthesiaType;
        }
    }



    @Override
    public void performTreatment() {
        System.out.println("Surgery with " + anesthesiaType + " anesthesia");
        completed = true;
    }

    @Override
    public double calculateCost() {
        return cost + riskLevel * 100;
    }

    @Override
    public void check(){
        System.out.println("Perform blood tests and anesthesia consultation");
    }

    public void showAnesthesiaType() {
        System.out.println("Anesthesia: " + anesthesiaType);
    }
    public void howRisky(){
        if(riskLevel>=3){
            System.out.println("Dangerous surgery");
        }else {
            System.out.println("Safe surgery");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Anesthesia type: "+ anesthesiaType + ", Risk level: "+riskLevel;
    }
}