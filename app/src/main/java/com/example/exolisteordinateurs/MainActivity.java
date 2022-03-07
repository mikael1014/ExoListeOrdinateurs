package com.example.exolisteordinateurs;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exolisteordinateurs.dao.AppDatabase;
import com.example.exolisteordinateurs.dao.OrdinateurDao;
import com.example.exolisteordinateurs.entities.Ordinateur;
import com.example.exolisteordinateurs.entities.enum_.PublicViser;
import com.example.exolisteordinateurs.entities.enum_.TypeClavier;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AppDatabase database;
    Ordinateur ordinateur =new Ordinateur();
    public void openPage(View view){
        Intent intent = new Intent(this,NewOrdinateurActivity.class);
        intent.putExtra("selectedOrdinateur", ordinateur);
        //  intent.putExtra("saisie",findViewById(R.id.editTextSasie).getv());
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = AppDatabase.getInstance(this);

        OrdinateurDao ordinateurDao = database.getOrdinateurDao();

        //       List<Ordinateur> listeOrdinateurs = new ArrayList<>();

        //       Log.i("Ordinateur",listeOrdinateurs.toString());
        Ordinateur ordinateur1 = new Ordinateur(1, "2010", "marque1", "numSerie1", PublicViser.CASUAL
                , TypeClavier.AZERTY);
        Ordinateur ordinateur2 = new Ordinateur(2, "2017", "marque2", "numSerie2", PublicViser.PRO
                , TypeClavier.QWERTY);
        Ordinateur ordinateur3 = new Ordinateur(3, "2020", "marque3", "numSerie3", PublicViser.GAMING
                , TypeClavier.AZERTY);
        Ordinateur ordinateur4 = new Ordinateur(4, "2000", "marque4", "numSerie4", PublicViser.PRO
                , TypeClavier.AZERTY);
        Ordinateur ordinateur5 = new Ordinateur(5, "2008", "marque5", "numSerie5", PublicViser.CASUAL
                , TypeClavier.QWERTY);
        Ordinateur ordinateur6 = new Ordinateur(6, "2022", "marque6", "numSerie6", PublicViser.GAMING
                , TypeClavier.AZERTY);


//        ordinateurDao.ajouter(ordinateur1);
//        ordinateurDao.ajouter(ordinateur2);
//        ordinateurDao.ajouter(ordinateur3);
//        ordinateurDao.ajouter(ordinateur4);
//        ordinateurDao.ajouter(ordinateur5);
//        ordinateurDao.ajouter(ordinateur6);


        List<Ordinateur> listeOrdinateurs = ordinateurDao.findAll();


        Ordinateur ordinateurById = ordinateurDao.findById(1);
        ordinateurById.setMarque("NewMarque1");
        ordinateurById.setNumSerie("NewNumserie1");
        ordinateurById.setAnneeDeFabrication("2016");
        ordinateurById.setTypeClavier(TypeClavier.AZERTY);
        ordinateurById.setPublicViser(PublicViser.CASUAL);

        ordinateurDao.update(ordinateurById);
 //       ordinateurDao.delete(ordinateurById);
        listeOrdinateurs = ordinateurDao.findAll();
        Log.i("Ordinateur", listeOrdinateurs.toString());


        RecyclerView recyclerView = findViewById(R.id.recycleView);

        OrdinateurAdapter ordinateurAdapter = new OrdinateurAdapter(listeOrdinateurs);
        recyclerView.setAdapter(ordinateurAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

    }

}