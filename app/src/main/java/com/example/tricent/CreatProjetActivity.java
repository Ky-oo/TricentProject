package com.example.tricent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tricent.databinding.ActivityCreatProjetBinding;

import java.util.ArrayList;
import java.util.List;


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

              Spinner spinner = (Spinner) findViewById(R.id.spinnerCategorie);

              List<Categorie> categories = new ArrayList<Categorie>();
              categories.add(new Categorie("voyage"));
              categories.add(new Categorie("soiree"));
              categories.add(new Categorie("sortie"));
              categories.add(new Categorie("picninc"));

              ArrayAdapter<Categorie> adapter = new ArrayAdapter<Categorie>(this, android.R.layout.simple_spinner_item, categories);

              adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

              spinner.setAdapter(adapter);

              String userInputTitre = binding.editTextTitre.getText().toString();
              String userInputDescription = binding.editTextDescription.getText().toString();
              Categorie userInputCategorie = (Categorie) binding.spinnerCategorie.getSelectedItem();

              Projet newProjet = new Projet(userInputTitre, userInputDescription, userInputCategorie);

              Toast.makeText(CreatProjetActivity.this, newProjet.toString(), Toast.LENGTH_SHORT).show();


          }
      });





    }}