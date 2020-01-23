package com.decagonhq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void getLibrarian() {
    }

    @Test
    void setLibrarian() {
    }

    @Test
    void getBooks() {
    }

    @Test
    void setBooks() {
    }

    @Test
    void getBorrowers() {
    }

    @Test
    void setBorrowers() {
    }

    @Test
    void getBooksBorrowedDetails() {
    }

    @Test
    void addBook() {
        Library decagon = new Library("jide");
        assertNotNull(decagon);
        decagon.addBook("things fall apart", 5);
        String name = decagon.getLibrarian();
        int amount = decagon.getBooks().get("things fall apart");
        boolean check = decagon.getBooks().containsKey("things fall apart2");
        assertEquals("jide", name);
        assertEquals(5, amount);
        assertTrue(check);
    }

    @Test
    void printBooks() {
    }

    @Test
    void addToBorrowersList() {
    }

    @Test
    void lendOutBooks() {

    }

    @Test
    void addToBorrowersList2() {
    }

    @Test
    void lendOutBooks2() {
    }
}