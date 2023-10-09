package com.example.tricent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.tricent.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        button = (Button) findViewById(R.id.button_create_project);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();

            }
        });
        ArrayList<Projet> projets = new ArrayList<Projet>();
        projets.add(new Projet("Attentiooooon", "UAAAAA", new Categorie("soireeee")));

        binding.recyclerDesProj.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.recyclerDesProj.setLayoutManager(layoutManager);
        binding.recyclerDesProj.setFocusable(false);

        RecyclerViewAdapter myAdapterProjets= new RecyclerViewAdapter(projets);
        binding.recyclerDesProj.setAdapter((myAdapterProjets));
    }
    public void openNewActivity(){
        Intent intent = new Intent(MainActivity.this, CreatProjetActivity.class);
        activityResultLauncher.launch(intent);
    }
    private ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new  ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result.getResultCode() == RESULT_OK) {
                Intent resultIntent = result.getData();
                if (resultIntent != null) {
                    Projet newProjet = (Projet) resultIntent.getSerializableExtra("ProjetCree");
                    if (newProjet != null) {
                        Log.d("Resultat", newProjet.toString());
                    }
                }
            }
        }

    });}