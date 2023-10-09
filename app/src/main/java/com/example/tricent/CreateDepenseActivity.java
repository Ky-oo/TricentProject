package com.example.tricent;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CreateDepenseActivity extends AppCompatActivity {

    private Button boutonAjouter;
    private EditText saisiTitre;
    private EditText saisiBudget;
    private EditText entrerDate;
    private  Spinner unePersonne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_depense);

        boutonAjouter = findViewById(R.id.buttonAjouter);
        saisiTitre = findViewById(R.id.saisiText);
        saisiBudget = findViewById(R.id.budget);
        entrerDate  = findViewById(R.id.saisiDate);
        unePersonne = findViewById(R.id.spinnerparticipant);


        boutonAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Récupérer les valeurs du champNom et champMontant
                String titre = saisiTitre.getText().toString();
                double montant = Double.parseDouble(saisiBudget.getText().toString());
                String date = entrerDate.getText().toString();




                Depense nouvelleDepense = new Depense(titre, montant, date);

                Toast.makeText(CreateDepenseActivity.this, "Dépense ajoutée : " + titre+ " Dépence :"+ montant + " Date : "+ date, + Toast.LENGTH_SHORT).show();



                // Faire quelque chose avec la nouvelle dépense, par exemple, l'ajouter à une liste
                // ou la sauvegarder dans une base de données

                // Afficher un message pour indiquer que la dépense a été ajoutée

            }


        });


    }
}