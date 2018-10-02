package com.example.android.myhealth.objects;

public class Medication {

    private String medicationName;
    private String dose;
    private String route;
    private String instructions;

    public Medication(String medicationName, String dose, String route, String instructions){
        this.medicationName = medicationName;
        this.dose = dose;
        this.route = route;
        this.instructions = instructions;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public String getDose() {
        return dose;
    }

    public String getRoute() {
        return route;
    }

    public String getInstructions() {
        return instructions;
    }

}
