package com.example.tradenwear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntercambiarEnd extends AppCompatActivity {
    Button solicitarBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intercambiar_end);
        checkSolicitar();
    }
    public void checkSolicitar(){
        solicitarBtn = findViewById(R.id.solicitar);
        solicitarBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntercambiarEnd.this, MainActivity.class));
            }
        });
    }
}