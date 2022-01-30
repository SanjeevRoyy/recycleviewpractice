package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<ModelName>modelNameList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleviewid);
        modelNameList = new ArrayList<>();
        modelNameList.add(new ModelName("Akash Mandal","9804355214",R.drawable.a));
        modelNameList.add(new ModelName("Subodh Pokherel","9815318122",R.drawable.h));
        modelNameList.add(new ModelName("Binod Mahato","9807007673",R.drawable.n));
        modelNameList.add(new ModelName("Sushil Karkey","9815026131",R.drawable.background_image_one_signin));

        MyAdapterClass adapter =new MyAdapterClass(getApplicationContext(),modelNameList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);
    }
}