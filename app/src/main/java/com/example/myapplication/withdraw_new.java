package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class withdraw_new extends AppCompatActivity {
    private TextInputLayout Input_3,Input_4;
    private Button Input2_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_new);
        Input_3 = findViewById(R.id.Input_3);
        Input_4 = findViewById(R.id.Input_4);
        Input2_button = findViewById(R.id.Input2_button);

        Input2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_1 = Integer.parseInt(Input_3.getEditText().getText().toString().trim());
                int input_2 = Integer.parseInt(Input_4.getEditText().getText().toString().trim());
                Intent intent = new Intent(getBaseContext(), MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}