package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button meep,maad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maad = (Button) findViewById(R.id.mad);
        meep = (Button) findViewById(R.id.deppsito);
        meep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), deposit_new.class);
                startActivity(intent);
                finish();
            }
        });
        maad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), deposit_new.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void What() {

    }
    private void pushher() {

    }
    private void pushme() {

    }
}