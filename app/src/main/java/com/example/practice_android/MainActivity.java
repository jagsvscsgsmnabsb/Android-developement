package com.example.practice_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Contactmodel> arraycontact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView Cnt = findViewById(R.id.Cnt);


        Cnt.setLayoutManager(new LinearLayoutManager(this));
        arraycontact.add(new Contactmodel(R.drawable.g, "A" , "8998978686"));
        arraycontact.add(new Contactmodel(R.drawable.f, "B" , "8998978686"));
        arraycontact.add(new Contactmodel(R.drawable.b, "C" , "8998978686"));
        arraycontact.add(new Contactmodel(R.drawable.c, "D" , "8998978686"));
        arraycontact.add(new Contactmodel(R.drawable.d, "E" , "8998978686"));
        arraycontact.add(new Contactmodel(R.drawable.a, "G" , "8998978686"));
        arraycontact.add(new Contactmodel(R.drawable.e, "H" , "8998978686"));
        arraycontact.add(new Contactmodel(R.drawable.b, "I" , "8998978686"));

       // RecycleContactAdapter adapter = new RecycleContactAdapter(this , arraycontact);



       RecycleContactAdapter adapter= new RecycleContactAdapter(this, arraycontact);
         Cnt.setAdapter(adapter);




    }
}