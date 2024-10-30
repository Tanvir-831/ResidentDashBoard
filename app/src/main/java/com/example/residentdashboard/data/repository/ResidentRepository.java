package com.example.residentdashboard.data.repository;
import com.example.residentdashboard.data.model.ParkingSlot;
import com.example.residentdashboard.data.model.Event;
import com.example.residentdashboard.data.model.ServiceRequest;
import java.util.ArrayList;
import java.util.List;

public class ResidentRepository {

    public List<ParkingSlot> getParkingSlots() {
        List<ParkingSlot> parkingSlots = new ArrayList<>();
        parkingSlots.add(new ParkingSlot("A1", "Occupied", "V1234"));
        parkingSlots.add(new ParkingSlot("A2", "Available", "V5678"));
        return parkingSlots;
    }

    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        events.add(new Event("E1", "Community Hall", "2024-11-01", "Festival Celebration"));
        events.add(new Event("E2", "Garden", "2024-11-05", "Yoga Workshop"));
        return events;
    }

    public List<ServiceRequest> getServiceRequests() {
        List<ServiceRequest> serviceRequests = new ArrayList<>();
        serviceRequests.add(new ServiceRequest("Plumbing", "Fix leaking pipe", "Pending"));
        serviceRequests.add(new ServiceRequest("Electric", "Replace fuse", "Completed"));
        return serviceRequests;
    }
}
