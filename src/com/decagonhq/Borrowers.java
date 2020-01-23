package com.decagonhq;

public class Borrowers {
    private String name;
    private String bookTitle;

    public Borrowers(String name, String bookTitle) {
        this.name = name;
        this.bookTitle = bookTitle;
    }

    public Borrowers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bookTitle;
    }
}
