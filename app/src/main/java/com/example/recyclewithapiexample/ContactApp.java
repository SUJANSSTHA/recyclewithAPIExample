package com.example.recyclewithapiexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactApp extends Activity {
    Button btnName;
    RecyclerView myRecycleView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        btnName = findViewById(R.id.btnName);
        myRecycleView = findViewById(R.id.myRecycleView);

    }

    public void LoadData() {
        DataLayer dL = new DataLayer(this);

        ArrayList<Contact> list = new ArrayList<Contact>();//call api with data
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        myAdapter adapter = new myAdapter(activity this, list);

        myRecycleView.setLayoutManager(manager);
        myRecycleView.setAdapter(adapter);
    }
}
