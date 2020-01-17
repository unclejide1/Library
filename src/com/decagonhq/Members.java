package com.decagonhq;

import java.util.ArrayList;

public class Members extends Borrowers{
    private String name;
    private int level;

    public Members(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Members(String name, String bookTitle, int level) {
        super(name, bookTitle);
        this.level = level;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString1() {
        return this.name + ": " + this.level;
    }
    @Override
    public String toString() {
        return this.name  + ": Level: " + this.level + "  BookTitle:" + this.getBookTitle();
    }

}
