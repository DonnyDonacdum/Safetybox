package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class with extends AppCompatActivity {
    private TextInputLayout name, money;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdraw);
        ASS();
        pushme();

    }
    private void pushme() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nama = Integer.parseInt(name.getEditText().getText().toString().trim());
                int jumlah = Integer.parseInt(money.getEditText().getText().toString().trim());
            }
        });
    }

    private void ASS() {
        name = findViewById(R.id.uang);
        money  = findViewById(R.id.jam);
        button = findViewById(R.id.input);
    }
}
