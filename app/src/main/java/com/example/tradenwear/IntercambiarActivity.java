package com.example.tradenwear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class IntercambiarActivity extends AppCompatActivity {
    Spinner dropdown;
    Spinner dropdownTallas;
    Spinner dropdownSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intercambiar);
        dropdown = findViewById(R.id.tipoPrendaSpin2);
        dropdownTallas = findViewById(R.id.spinnerTalla2);
        dropdownSexo = findViewById(R.id.spinner2);
        initspinnerfooter();
        manageNext();
    }

    public void manageNext(){
        Button confirmBtn = (Button) findViewById(R.id.confirm_button);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntercambiarActivity.this, DisplayChoices.class));
            }
        });
    }

    private void initspinnerfooter() {
        String[] tallas = new String[]{
                "ECH", "CH", "M", " G", "EG",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IntercambiarActivity.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.tiposPrenda));
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });


        ArrayAdapter<String> adapterTallas = new ArrayAdapter<String>(IntercambiarActivity.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.tallasPrenda));
        dropdownTallas.setAdapter(adapterTallas);
        dropdownTallas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        ArrayAdapter<String> adapterSexo = new ArrayAdapter<String>(IntercambiarActivity.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.sexoArray));
        dropdownSexo.setAdapter(adapterSexo);
        dropdownSexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

    }
}