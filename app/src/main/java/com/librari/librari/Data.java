package com.librari.librari;


public class Data {
    private String bookName , bookAuthor;
    private int picture;

    public String getBookName() {
        return bookName;
    }
    public String getBookAuthor() {return bookAuthor;}

    public int getPicture() {
        return picture;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {this.bookAuthor = bookAuthor;}

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public Data(String bookName , String bookAuthor, int picture) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.picture = picture;
    }
}
