package com.example.tricent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    Categorie voyage = new Categorie("voyage");
    Categorie soiree = new Categorie("soiree");
    Categorie sortie = new Categorie("sortie");
    Categorie picnic = new Categorie("picnic");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}