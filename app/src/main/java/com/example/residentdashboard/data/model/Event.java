package com.example.residentdashboard.data.model;

public class Event {
    private String eventID;
    private String location;
    private String date;
    private String eventName;

    public Event(String eventID, String location, String date, String eventName) {
        this.eventID = eventID;
        this.location = location;
        this.date = date;
        this.eventName = eventName;
    }

    public String getEventID() { return eventID; }
    public String getLocation() { return location; }
    public String getDate() { return date; }
    public String getEventName() { return eventName; }
}
