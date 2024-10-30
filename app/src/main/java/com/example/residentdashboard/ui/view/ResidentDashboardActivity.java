package com.example.residentdashboard.ui.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.residentdashboard.R;
import com.example.residentdashboard.data.model.Event;
import com.example.residentdashboard.ui.viewmodel.ResidentDashboardViewModel;
import java.util.List;

public class ResidentDashboardActivity extends AppCompatActivity {

    private ResidentDashboardViewModel viewModel;
    private EventAdapter eventAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident_dashboard);

        // Initialize ViewModel
        viewModel = new ViewModelProvider(this).get(ResidentDashboardViewModel.class);

        // Set up RecyclerView for Events
        RecyclerView eventsRecyclerView = findViewById(R.id.eventsRecyclerView);
        eventsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Observe Event List and update the adapter
        viewModel.getEvents().observe(this, new Observer<List<Event>>() {
            @Override
            public void onChanged(List<Event> events) {
                eventAdapter = new EventAdapter(events);
                eventsRecyclerView.setAdapter(eventAdapter);
            }
        });
    }
}
