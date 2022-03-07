package com.example.exolisteordinateurs.model;

import com.example.exolisteordinateurs.model.enum_.PublicViser;
import com.example.exolisteordinateurs.model.enum_.TypeClavier;

import java.io.Serializable;

public class Ordinateur implements Serializable {
    private long id;
    private String anneeDeFabrication;
    private String marque;
    private String numSerie;
    private PublicViser publicViser;
    private TypeClavier typeClavier;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnneeDeFabrication() {
        return anneeDeFabrication;
    }

    public void setAnneeDeFabrication(String anneeDeFabrication) {
        this.anneeDeFabrication = anneeDeFabrication;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public PublicViser getPublicViser() {
        return publicViser;
    }

    public void setPublicViser(PublicViser publicViser) {
        this.publicViser = publicViser;
    }

    public TypeClavier getTypeClavier() {
        return typeClavier;
    }

    public void setTypeClavier(TypeClavier typeClavier) {
        this.typeClavier = typeClavier;
    }

    public Ordinateur() {
    }

    public Ordinateur(long id, String anneDeFabrication, String marque, String numSerie, PublicViser publicViser, TypeClavier typeClavier) {
        this.id = id;
        this.anneeDeFabrication = anneDeFabrication;
        this.marque = marque;
        this.numSerie = numSerie;
        this.publicViser = publicViser;
        this.typeClavier = typeClavier;
    }

    public Ordinateur(String anneDeFabrication, String marque, String numSerie, PublicViser publicViser, TypeClavier typeClavier) {
        this.anneeDeFabrication = anneDeFabrication;
        this.marque = marque;
        this.numSerie = numSerie;
        this.publicViser = publicViser;
        this.typeClavier = typeClavier;
    }
}
