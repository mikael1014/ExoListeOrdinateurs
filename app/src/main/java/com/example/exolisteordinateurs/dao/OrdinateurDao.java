package com.example.exolisteordinateurs.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.example.exolisteordinateurs.entities.Ordinateur;

import java.util.List;

@Dao
public interface OrdinateurDao {
    @Query("SELECT * FROM Ordinateur")
    List<Ordinateur> findAll();
    @Insert
    void ajouter(Ordinateur ordinateur);

    @Update
    void update(Ordinateur ordinateur);

    @Delete
    void  delete(Ordinateur ordinateur);

    @Query("SELECT * FROM ordinateur where idOrdinateur =:id LIMIT 1")
    Ordinateur findById(int id);

}
