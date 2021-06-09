package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class draw extends AppCompatActivity {
    private TextInputLayout nama1, cash;
    private Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deposit);
        pushme();
        ASSO();

    }

    private void pushme() {
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nama = Integer.parseInt(nama1.getEditText().getText().toString().trim());
                int jumlah = Integer.parseInt(cash.getEditText().getText().toString().trim());
                Intent intent = new Intent(draw.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void ASSO() {
        nama1 = findViewById(R.id.wan);
        cash = findViewById(R.id.map);
        butt = findViewById(R.id.inputed);
    }
}