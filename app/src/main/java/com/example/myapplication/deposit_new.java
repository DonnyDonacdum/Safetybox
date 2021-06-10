package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class deposit_new extends AppCompatActivity {
    private TextInputLayout Input_1,Input_2;
    private Button input_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit_new);
        Input_1 = findViewById(R.id.Input_1);
        Input_2 = findViewById(R.id.Input_2);
        input_button = findViewById(R.id.input_button);

        input_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_1 = Integer.parseInt(Input_1.getEditText().getText().toString().trim());
                int input_2 = Integer.parseInt(Input_2.getEditText().getText().toString().trim());
                Intent intent = new Intent(getBaseContext(), MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}