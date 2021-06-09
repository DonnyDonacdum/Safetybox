package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<ExampleItem> examplelist = new ArrayList<>();
        examplelist.add(new ExampleItem(R.drawable.ic_android,"Line 1", "Line 2"));

        mRecycleView = findViewById(R.id.recycleView);
        mRecycleView.setHasFixedSize(true);
        mLayoutmanager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(examplelist);

        mRecycleView.setLayoutManager(mLayoutmanager);
        mRecycleView.setAdapter(mAdapter);

    }
}