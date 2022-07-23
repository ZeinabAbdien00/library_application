package com.librari.librari.Room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName = "Room")
class PDF implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int id=0;

    @ColumnInfo(name = "bookName")
    String bookName ="";

    @ColumnInfo(name="authorName")
    String authorName ="";

    @ColumnInfo(name="bookImage")
    int bookImage =0;

    @ColumnInfo(name="PDF_link")
    String PDF_link ;

    public String getPDF_link() {return PDF_link;}

    public void setPDF_link(String PDF_link) {this.PDF_link = PDF_link;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookImage() {
        return bookImage;
    }

    public void setBookImage(int bookImage) {this.bookImage = bookImage;}

}


