package com.example.tradenwear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElegirIntercambioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_intercambio);
        manageUserChoice();
        manageStorageChoice();
    }
    public void manageUserChoice () {
        Button userBtn = (Button) findViewById(R.id.userChoice);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElegirIntercambioActivity.this, IntercambiarActivity.class));
            }
        });
    }
    public void manageStorageChoice() {
        Button storageBtn = (Button) findViewById(R.id.storageChoice);
        storageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElegirIntercambioActivity.this, IntercambiarActivity.class));
            }
        });
    }
}