package com.example.tricent;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.tricent.databinding.ActivityCreatProjetBinding;


public class CreatProjetActivity extends AppCompatActivity {

    private ActivityCreatProjetBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreatProjetBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


      binding.buttonCrErProjet.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              String userInputTitre = binding.editTextTitre.getText().toString();
              String userInputDescription = binding.editTextDescription.getText().toString();

              Projet newProjet = new Projet(userInputTitre, userInputDescription, Catégorie.soiree);

              Toast.makeText(CreatProjetActivity.this, newProjet.toString(), Toast.LENGTH_SHORT).show();


          }
      });





    }}