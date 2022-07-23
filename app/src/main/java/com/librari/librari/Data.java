package com.librari.librari;


public class Data {
    private String bookName , bookAuthor , bookLink;
    private int picture;

    public String getBookName() {
        return bookName;
    }
    public String getBookLink() {return bookLink;}
    public String getBookAuthor() {return bookAuthor;}

    public int getPicture() {
        return picture;
    }

    public void setBookName(String bookName) {this.bookName = bookName;}

    public void setBookLink(String bookLink) {this.bookLink = bookLink;}

    public void setBookAuthor(String bookAuthor) {this.bookAuthor = bookAuthor;}

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public Data(String bookName , String bookAuthor, int picture , String bookLink) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookLink = bookLink;
        this.picture = picture;

    }
}
