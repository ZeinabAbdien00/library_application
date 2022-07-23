package com.librari.librari;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.librari.librari.Room.MainDAO;
import com.librari.librari.Room.PDF;

import java.util.List;

public class AddBook extends AppCompatActivity {

    MainDAO mainDAO ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        mainDAO = new MainDAO() {
            @Override
            public void insert(PDF pdf) {

            }

            @Override
            public List<PDF> getAll() {
                return null;
            }

            @Override
            public void update(int id, String bookName, String authorName) {

            }
        }




    }
}