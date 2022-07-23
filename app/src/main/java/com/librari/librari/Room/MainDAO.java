package com.librari.librari.Room;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MainDAO {

    @Insert(onConflict = REPLACE)
    void insert(PDF pdf);

    @Query("SELECT * FROM Room ORDER BY id DESC" )
    List<PDF> getAll();

    @Query("UPDATE Room SET bookName = :bookName ,authorName = :authorName WHERE id = :id ")
    void update(int id , String bookName , String authorName);


}
