package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String input_1 = getIntent().getExtras().getString("input_1" );
        String input_2 = getIntent().getExtras().getString("input_2");

        result = findViewById(R.id.result);
        result.setText("Deposit Anda yaitu:" +input_1+ " Pada tanggal: " +input_2);



    }
}