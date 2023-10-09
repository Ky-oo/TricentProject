package com.example.tricent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tricent.databinding.ActivityMainBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private List<Projet> listeData;

    public RecyclerViewAdapter(List<Projet> listeData) {
        this.listeData = listeData;
    }



    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_1, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        Projet projet = listeData.get(position);
        holder.recycler_titre.setText(projet.getNom());
        holder.recycler_desc.setText(projet.getDescription());
    }

    @Override
    public int getItemCount() {
        return listeData.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView recycler_titre;
        TextView recycler_desc;

        public RecyclerViewHolder (@NonNull View itemView){
            super(itemView);
            recycler_titre = itemView.findViewById(R.id.recycler_titre);
            recycler_desc = itemView.findViewById(R.id.recycler_desc);

        }
    }
}
