package com.example.tradenwear;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DisplayChoices extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Sueter 1", "Sueter 2", "Sueter 3", "Sueter 4", "Sueter 5", "Sueter 6", "Sueter 7"};
    String mDescription[] = {"De Patricia Gómez", "De Juan Castro", "De Julio Sauceda", "De Abril Ayala", "De Yazmín Treviño", "De Emilio Garza", "De Diego Martinez"};
    int images[] = {R.drawable.prenda1, R.drawable.prenda2, R.drawable.prenda3, R.drawable.prenda4, R.drawable.prenda5, R.drawable.prenda6, R.drawable.prenda7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_choices);

        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        //click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(DisplayChoices.this, IntercambiarEnd.class));
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.itemTitle, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.itemTitle);
            TextView myDescription = row.findViewById(R.id.itemOwner);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}