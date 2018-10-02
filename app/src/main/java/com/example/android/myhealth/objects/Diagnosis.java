package com.example.android.myhealth.objects;

public class Diagnosis {

    private String diagnosisName;
    private String ICD10;

    public Diagnosis(String diagnosisName, String ICD10){
        this.diagnosisName = diagnosisName;
        this.ICD10 = ICD10;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public void setICD10(String ICD10) {
        this.ICD10 = ICD10;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public String getICD10() {
        return ICD10;
    }
}
