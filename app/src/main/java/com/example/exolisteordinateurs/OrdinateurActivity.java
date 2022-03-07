package com.example.exolisteordinateurs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exolisteordinateurs.model.Ordinateur;

public class OrdinateurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordinateur);
        Ordinateur ordinateur = (Ordinateur) getIntent().getSerializableExtra("Ordinateur");

        TextView textId = findViewById(R.id.txtVId2);
        textId.setText(String.valueOf(ordinateur.getId()));
        TextView textMarque = findViewById(R.id.txtVMarque2);
        textMarque.setText(ordinateur.getMarque());
        TextView textAnneeFabri = findViewById(R.id.txtVAnneeFabri2);
        textAnneeFabri.setText(ordinateur.getAnneeDeFabrication());
        TextView textNumSerie = findViewById(R.id.txtVNumSerie2);
        textNumSerie.setText(ordinateur.getNumSerie());
        TextView textTypeClavier = findViewById(R.id.txtVTypeClavier2);
        textTypeClavier.setText(ordinateur.getTypeClavier().toString());
        TextView textPublicViser = findViewById(R.id.txtVPublicViser2);
        textPublicViser.setText(ordinateur.getPublicViser().toString());

    }
}