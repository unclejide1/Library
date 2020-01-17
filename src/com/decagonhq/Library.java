package com.decagonhq;

import java.util.*;

public class Library extends MembersArray{
    private String librarian;
    private HashMap<String, Integer> books;
    private Queue borrowers;
    private Date time;
    private PriorityQueue<Members> booksBorrowedDetails = new PriorityQueue<Members>(2,new BorrowerComparator());


    public Library(ArrayList<Members> members) {
        super(members);
    }

    public Library(String librarian) {
        super();
        this.librarian = librarian;
        this.books = new HashMap<>();
        this.borrowers = new Queue();
    }

    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public HashMap<String, Integer> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Integer> books) {
        this.books = books;
    }

    public Queue getBorrowers() {
        return borrowers;
    }


    public void setBorrowers(Queue borrowers) {
        this.borrowers = borrowers;
    }

    public PriorityQueue<Members> getBooksBorrowedDetails() {
        return booksBorrowedDetails;
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

    private void removeBook(String title){
        if(this.books.containsKey(title) && (this.books.get(title) > 0)){
            this.books.put(title, (this.books.get(title) -1));
            System.out.println(1 + " copy  of " + title + " has been given out, now left with " + this.books.get(title) + " copies");
        }else {
            System.out.println("Book taken, no copies remaining, please add more books");
        }
    }

    public void printBooks(){
        System.out.println("Initial Mappings are: " + books);
    }

    public void addToBorrowersList(Queue borrowers, MembersArray memb,String name, String bookTitle) {
        Iterator<Members> iterator = memb.getMembers().iterator();
//        System.out.println("");

        while (iterator.hasNext()) {
            if ((iterator.next().getName().equals(name))) {
                    if(borrowers.enqueue(new Borrowers(name, bookTitle)) == 0) {
                        System.out.println(name + " is allowed to borrow " + bookTitle + ", he is not in the queue");
                        return;
                    } else if(borrowers.enqueue(new Borrowers(name, bookTitle)) == -1) {
                        System.out.println( name + " can't borrow again  because he is in the queue");
                        return;
                    }
                    return;
            }
        }

        System.out.println( name + " is not allowed to borrow " + bookTitle);

    }

    public void lendOutBooks(Queue borrowers, HashMap<String, Integer> books){
        Borrowers newB = borrowers.dequeue();
        if(newB != null){
            String title = newB.getBookTitle();
            if(books.get(title) > 0) {
                removeBook(title);
            }else {
                System.out.println("books Taken, you have been taken out of the queue, please come back later");
            }

        }

    }
    public void addToBorrowersList2(MembersArray memb,String name, String bookTitle, int level) {
        Iterator<Members> iterator = memb.getMembers().iterator();
        time = new Date();
        System.out.println("");
        if((this.books.get(bookTitle) == 0) && (!this.books.containsKey(bookTitle))){
            System.out.println("Book Taken");
            return;
        }
        while (iterator.hasNext()) {
            if ((iterator.next().getName().equals(name))) {
                 this.booksBorrowedDetails.add(new Members(name, bookTitle, level));
                System.out.println(name + " has requested for " + bookTitle + " at " + time);
                 return;
                }
        }


        System.out.println( name + " is not allowed to borrow " + bookTitle);
    }

    public void lendOutBooks2(){
        Members member = this.booksBorrowedDetails.poll();
        assert member != null;
        String name = member.getName();
        String bookTitle = member.getBookTitle();
        if(this.books.get(bookTitle) == 0){
            System.out.println("you have to leave the queue, this book is not available");
            return;
        }
        removeBook(bookTitle);
        System.out.println(name + " has been lent " + bookTitle);

    }

}



