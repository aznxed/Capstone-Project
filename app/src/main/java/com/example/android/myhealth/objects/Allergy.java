package com.example.android.myhealth.objects;

public class Allergy {

    private String allergen;
    private String severity;
    private String reaction;

    public Allergy(String allergen, String severity, String reaction){
        this.allergen = allergen;
        this.severity = severity;
        this.reaction = reaction;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getAllergen() {
        return allergen;
    }

    public String getSeverity() {
        return severity;
    }

    public String getReaction() {
        return reaction;
    }
}
