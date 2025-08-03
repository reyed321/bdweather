package com.example.bdweather.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bdweather.Adapters.HourlyAdapters;
import com.example.bdweather.Domain.Hourly;
import com.example.bdweather.R;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
      private RecyclerView.Adapter adapterHorly;
      private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initRecyclerview();
    }
    private void initRecyclerview(){
        ArrayList<Hourly> items=new ArrayList<>();

        items.add(new Hourly("9pm",28,"cloudy"));
        items.add(new Hourly("11pm",29,"sun"));
        items.add(new Hourly("12pm",30,"wind"));
        items.add(new Hourly("1pm",27,"rainy"));
        items.add(new Hourly("2pm",26,"storm"));

        recyclerView = findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHorly = new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHorly);



    }

    }
