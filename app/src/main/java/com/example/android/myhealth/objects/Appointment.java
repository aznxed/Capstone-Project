package com.example.android.myhealth.objects;

public class Appointment {

    private String time;
    private String date;
    private String location;
    private Provider provider;

    public Appointment(String time, String date, String location, Provider provider){
        this.time = time;
        this.date = date;
        this.location = location;
        this.provider = provider;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public Provider getProvider() {
        return provider;
    }
}
