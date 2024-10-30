package com.example.residentdashboard.data.model;
public class ServiceRequest {
    private String serviceType;
    private String description;
    private String status;

    public ServiceRequest(String serviceType, String description, String status) {
        this.serviceType = serviceType;
        this.description = description;
        this.status = status;
    }

    public String getServiceType() { return serviceType; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
}
