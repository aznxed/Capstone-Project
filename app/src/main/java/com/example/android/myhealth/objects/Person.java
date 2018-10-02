package com.example.android.myhealth.objects;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String dateOfBirth;
    private String gender;

    public Person(String firstName, String middleName, String lastName, String dateOfBirth, String gender){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String dateOfBirth, String gender){
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
}
