package com.decagonhq;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private String librarian;
    private HashMap<String, Integer> books;

    public Library(String librarian) {
        this.librarian = librarian;
        this.books = new HashMap<>();
    }

    public void addBook(String title, int amount){
            if(!this.books.containsKey(title)) {
                this.books.put(title, amount);
                System.out.println(amount + " of " + title + " has been added");
            }else {
                this.books.put(title, (books.get(title) +amount));
                System.out.println(title + " has been increased by " + amount);
            }

    }




}
