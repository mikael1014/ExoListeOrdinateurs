package com.example.exolisteordinateurs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exolisteordinateurs.model.Ordinateur;
import com.example.exolisteordinateurs.model.enum_.PublicViser;
import com.example.exolisteordinateurs.model.enum_.TypeClavier;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Ordinateur> listeOrdinateurs = new ArrayList<>();
        listeOrdinateurs.add(new Ordinateur(1,"2010",  "marque1", "numSerie1", PublicViser.CASUAL
                , TypeClavier.AZERTY));
        listeOrdinateurs.add(new Ordinateur(2,"2017",  "marque2", "numSerie2", PublicViser.PRO
                , TypeClavier.QWERTY));
        listeOrdinateurs.add(new Ordinateur(3,"2020",  "marque3", "numSerie3", PublicViser.GAMING
                , TypeClavier.AZERTY));
        listeOrdinateurs.add(new Ordinateur(4,"2000",  "marque4", "numSerie4", PublicViser.PRO
                , TypeClavier.AZERTY));
        listeOrdinateurs.add(new Ordinateur(5,"2008",  "marque5", "numSerie5", PublicViser.CASUAL
                , TypeClavier.QWERTY));
        listeOrdinateurs.add(new Ordinateur(6,"2022",  "marque6", "numSerie6", PublicViser.GAMING
                , TypeClavier.AZERTY));

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        OrdinateurAdapter ordinateurAdapter = new OrdinateurAdapter(listeOrdinateurs);
        recyclerView.setAdapter(ordinateurAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

    }

}