package com.example.exolisteordinateurs.dao;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.exolisteordinateurs.entities.Ordinateur;


@Database(entities = {Ordinateur.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract OrdinateurDao getOrdinateurDao();

    private static AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context){
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"test")
                    .allowMainThreadQueries().build();

        }

        return INSTANCE;
    }
}
