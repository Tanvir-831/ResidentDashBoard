package com.example.residentdashboard.data.model;

public class ParkingSlot {
    private String slotID;
    private String status;
    private String vehicleID;

    public ParkingSlot(String slotID, String status, String vehicleID) {
        this.slotID = slotID;
        this.status = status;
        this.vehicleID = vehicleID;
    }

    public String getSlotID() { return slotID; }
    public String getStatus() { return status; }
    public String getVehicleID() { return vehicleID; }
}
