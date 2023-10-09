package com.example.tricent;

import androidx.appcompat.app.AppCompatActivity;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tricent.databinding.ActivityCreateDepenseBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CreateDepenseActivity extends AppCompatActivity {

    private ActivityCreateDepenseBinding binding;

    private Button boutonAjouter;
    private EditText saisiTitre;
    private EditText saisiBudget;
    private EditText entrerDate;
    private Button boutonDate;
    private Calendar calendar = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_depense);

        ActivityCreateDepenseBinding binding = ActivityCreateDepenseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        boutonAjouter = findViewById(R.id.buttonAjouter);
        saisiTitre = findViewById(R.id.saisiText);
        saisiBudget = findViewById(R.id.budget);
        entrerDate  = findViewById(R.id.saisiDate);
        boutonDate = findViewById(R.id.Date);

        boutonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the DatePicker dialog
                showDatePicker();
            }
        });


        boutonAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String titre = saisiTitre.getText().toString();
                double montant = Double.parseDouble(saisiBudget.getText().toString());
                String date = entrerDate.getText().toString();
                String participant = binding.spinnerparticipant.getSelectedItem().toString();




                Depense nouvelleDepense = new Depense(titre, montant, date, participant);

                Toast.makeText(CreateDepenseActivity.this, nouvelleDepense.toString(), Toast.LENGTH_SHORT).show();

                // Faire quelque chose avec la nouvelle dépense, par exemple, l'ajouter à une liste

            }


        });


    }
    private void showDatePicker() {
        // Create a DatePickerDialog
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        // Create a new Calendar instance to hold the selected date
                        Calendar selectedDate = Calendar.getInstance();
                        // Set the selected date using the values received from the DatePicker dialog
                        selectedDate.set(year, monthOfYear, dayOfMonth);
                        // Create a SimpleDateFormat to format the date as "dd/MM/yyyy"
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                        // Format the selected date into a string
                        String formattedDate = dateFormat.format(selectedDate.getTime());
                        // Update the TextView to display the selected date with the "Selected Date: " prefix
                        entrerDate.setText(formattedDate);
                    }
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        );
        // Show the DatePicker dialog
        datePickerDialog.show();
    }

}