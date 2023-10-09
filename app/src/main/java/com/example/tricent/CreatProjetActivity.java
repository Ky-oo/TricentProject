package com.example.tricent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    private static final int ADD_USER_REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreatProjetBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<Categorie> categories = new ArrayList<>();
        categories.add(new Categorie("voyage"));
        categories.add(new Categorie("soiree"));
        categories.add(new Categorie("sortie"));
        categories.add(new Categorie("picnic"));

        List<String> categorieNames = new ArrayList<>();



        for (Categorie categorie : categories) {
            categorieNames.add(categorie.getLibelle());
        }

        Spinner spinner = findViewById(R.id.spinnerCategorie);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(CreatProjetActivity.this, android.R.layout.simple_spinner_item, categorieNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        List<String> UserNames = new ArrayList<>();
        if (getIntent().getSerializableExtra("userList") != null ) {
            List<User> userList = (List<User>) getIntent().getSerializableExtra("userList");
            Toast.makeText(CreatProjetActivity.this, userList.toString(), Toast.LENGTH_SHORT).show();

        }

        binding.buttonCrErProjet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String userInputTitre = binding.editTextTitre.getText().toString();
                String userInputDescription = binding.editTextDescription.getText().toString();
                String userInputDevise = binding.spinnerDevise.getSelectedItem().toString();
                Categorie userInputCategorie = null;
                for (Categorie categorie : categories) {
                    if (categorie.getLibelle().equals(binding.spinnerCategorie.getSelectedItem().toString())) {
                        userInputCategorie = categorie;
                        break;
                    }
                }

                Projet newProjet = new Projet(userInputTitre, userInputDescription, userInputCategorie, userInputDevise);

                Toast.makeText(CreatProjetActivity.this, newProjet.toString(), Toast.LENGTH_SHORT).show();

                binding.buttonAjouterParticipant.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String userLastName = binding.editTextNomAddUser.getText().toString();
                        String userFirstName = binding.editTextPrenom.getText().toString();
                        String userEmail = binding.editTextEmail.getText().toString();

                        User newUser = new User(userLastName, userFirstName, userEmail);
                        newProjet.addUserList(newUser);

                        newUser.toString();
                    }
                });


            }
        });





    }}