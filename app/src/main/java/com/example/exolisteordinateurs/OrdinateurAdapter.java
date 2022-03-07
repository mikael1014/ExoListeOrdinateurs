package com.example.exolisteordinateurs;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.exolisteordinateurs.model.Ordinateur;

import java.util.List;

public class OrdinateurAdapter extends RecyclerView.Adapter<OrdinateurAdapter.OrdinateurViewHolder>{
    private final List<Ordinateur> ordinateurs;

    public OrdinateurAdapter(List<Ordinateur> ordinateurs) {
        this.ordinateurs = ordinateurs;
    }

    @NonNull
    @Override
    public OrdinateurViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_ordinateur,parent,false);
        return new OrdinateurViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdinateurViewHolder holder, int position) {
        Ordinateur ordinateur = ordinateurs.get(position);
        holder.tvId.setText(String.valueOf(ordinateur.getId()));
        holder.tvMarque.setText(ordinateur.getMarque());
        holder.tvAnneeFabri.setText(String.valueOf(ordinateur.getAnneeDeFabrication()));
        holder.tvPublicViser.setText(ordinateur.getPublicViser().toString());
        holder.tvTypeClavier.setText(ordinateur.getTypeClavier().toString());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(),OrdinateurActivity.class);
            intent.putExtra("Ordinateur",ordinateur);
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return ordinateurs.size();
    }

    public static class OrdinateurViewHolder extends RecyclerView.ViewHolder {
        public TextView tvId;
        public TextView tvMarque;
        public TextView tvAnneeFabri;
        public TextView tvPublicViser;
        public TextView tvTypeClavier;

        public OrdinateurViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.txtVId);
            tvMarque = itemView.findViewById(R.id.txtVMarque);
            tvAnneeFabri = itemView.findViewById(R.id.txtVAnneeFabri);
            tvPublicViser = itemView.findViewById(R.id.txtVPublicViser);
            tvTypeClavier = itemView.findViewById(R.id.txtVTypeClavier);
        }
    }
}
