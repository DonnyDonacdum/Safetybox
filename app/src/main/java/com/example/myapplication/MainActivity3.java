package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String input_3 = getIntent().getExtras().getString("input_3" );
        String input_4 = getIntent().getExtras().getString("input_4");

        result2 = findViewById(R.id.result2);
        result2.setText("Deposit Anda yaitu:" +input_3+ "Pada tanggal" +input_4);



    }
}