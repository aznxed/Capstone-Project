package com.example.android.myhealth.objects;

import java.util.ArrayList;

public class Provider extends Person{

    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;

    public Provider(String firstName, String middleName, String lastName, String dateOfBirth, String gender) {
        super(firstName, middleName, lastName, dateOfBirth, gender);
    }

    public Provider(String firstName, String lastName, String dateOfBirth, String gender) {
        super(firstName, lastName, dateOfBirth, gender);
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    public void addAppointment(Appointment appointment){
        this.appointments.add(appointment);
    }
}
