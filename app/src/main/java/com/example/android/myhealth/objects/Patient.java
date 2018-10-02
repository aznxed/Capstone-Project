package com.example.android.myhealth.objects;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person{

    private ArrayList<Diagnosis> diagnoses;
    private ArrayList<Medication> medications;
    private ArrayList<Allergy> allergies;
    private ArrayList<Appointment> appointments;
    private ArrayList<Provider> providers;

    public Patient(String firstName, String middleName, String lastName, String dateOfBirth, String gender) {
        super(firstName, middleName, lastName, dateOfBirth, gender);
    }

    public Patient(String firstName, String lastName, String dateOfBirth, String gender) {
        super(firstName, lastName, dateOfBirth, gender);
    }

    public void setDiagnoses(ArrayList<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public void setMedications(ArrayList<Medication> medications) {
        this.medications = medications;
    }

    public void setAllergies(ArrayList<Allergy> allergies) {
        this.allergies = allergies;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    public ArrayList<Diagnosis> getDiagnoses() {
        return diagnoses;
    }

    public ArrayList<Medication> getMedications() {
        return medications;
    }

    public ArrayList<Allergy> getAllergies() {
        return allergies;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public void addDiagnosis(Diagnosis diagnosis){
        this.diagnoses.add(diagnosis);
    }

    public void addMedication(Medication medication){
        this.medications.add(medication);
    }

    public void addAllergy(Allergy allergy){
        this.allergies.add(allergy);
    }

    public void addAppointment(Appointment appointment){
        this.appointments.add(appointment);
    }

    public void addProvider(Provider provider){
        this.providers.add(provider);
    }


}
