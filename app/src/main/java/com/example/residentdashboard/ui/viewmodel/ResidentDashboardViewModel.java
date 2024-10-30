package com.example.residentdashboard.ui.viewmodel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.residentdashboard.data.model.ParkingSlot;
import com.example.residentdashboard.data.model.Event;
import com.example.residentdashboard.data.model.ServiceRequest;
import com.example.residentdashboard.data.repository.ResidentRepository;
import java.util.List;

public class ResidentDashboardViewModel extends ViewModel {
    private ResidentRepository repository;
    private MutableLiveData<List<ParkingSlot>> parkingSlots;
    private MutableLiveData<List<Event>> events;
    private MutableLiveData<List<ServiceRequest>> serviceRequests;

    public ResidentDashboardViewModel() {
        repository = new ResidentRepository();
        parkingSlots = new MutableLiveData<>(repository.getParkingSlots());
        events = new MutableLiveData<>(repository.getEvents());
        serviceRequests = new MutableLiveData<>(repository.getServiceRequests());
    }

    public LiveData<List<ParkingSlot>> getParkingSlots() { return parkingSlots; }
    public LiveData<List<Event>> getEvents() { return events; }
    public LiveData<List<ServiceRequest>> getServiceRequests() { return serviceRequests; }
}
