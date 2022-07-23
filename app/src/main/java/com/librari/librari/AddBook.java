package com.librari.librari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.librari.librari.Room.PDFdatabase;

public class AddBook extends AppCompatActivity {

    EditText bookName , bookAuthor , bookURL;
    Button add_btn ;
    PDFdatabase add ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        bookName =  findViewById(R.id.add_name);
        bookAuthor =  findViewById(R.id.add_author);
        bookURL =  findViewById(R.id.add_URL);
        add_btn =  findViewById(R.id.Add_btn);

        String Name = bookName.getText().toString();
        String author = bookAuthor.getText().toString();
        String URL = bookURL.getText().toString();

        add = new PDFdatabase();
        add.setBookName(Name);
        add.setAuthorName(author);
        add.setPDF_link(URL);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("Book details" , add);
                setResult(Activity.RESULT_OK ,intent);
                finish();

            }
        });






    }

}
