package com.decagonhq;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Library Decagon = new Library("chibueze");
	Decagon.addBook("things fall apart", 5);
//        Decagon.addBook("things fall apart", 5);
        Decagon.addBook("things fall apart2", 5);
//        Decagon.printBooks();
        MembersArray memberss = new MembersArray();
        memberss.addMember("jide", 1);
        memberss.addMember("david", 2);
        memberss.addMember("mikel", 3);
        memberss.addMember("ebi", 1);
        memberss.addMember("justice", 2);
        memberss.addMember("mike", 3);

//        printList(memberss);

//        Decagon.addToBorrowersList2(memberss,"jide", "things fall apart", 1);
//        Decagon.addToBorrowersList2(memberss,"justice", "things fall apart", 2);
//        Decagon.addToBorrowersList2(memberss,"david", "things fall apart2", 2);
//        Decagon.addToBorrowersList2(memberss,"mikel", "things fall apart", 3);
//
//        Decagon.addToBorrowersList2(memberss,"mike", "things fall apart", 3);
//        Decagon.addToBorrowersList2(memberss,"ebi", "things fall apart", 1);
//        Decagon.addToBorrowersList2(memberss,"james", "things fall apart", 1);
//        System.out.println(Decagon.getBooksBorrowedDetails());
//        Decagon.lendOutBooks2();
//        Decagon.lendOutBooks2();
//        Decagon.lendOutBooks2();
//        Decagon.lendOutBooks2();
//        Decagon.lendOutBooks2();
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
        Decagon.addToBorrowersList(Decagon.getBorrowers(), memberss,"david", "things fall apart");
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.addToBorrowersList(Decagon.getBorrowers(), memberss,"mikel", "things fall apart");
//        Decagon.addToQueue(Decagon.getBorrowers(), memberss,"mikel", "things fall apart");
//        Decagon.addToBorrowersList(Decagon.getBorrowers(), memberss,"justice", "things fall apart");
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.addToBorrowersList(Decagon.getBorrowers(), memberss,"ebi", "things fall apart");
//        Decagon.addToBorrowersList(Decagon.getBorrowers(), memberss,"jide", "things fall apart");
//        Decagon.addToBorrowersList(Decagon.getBorrowers(), memberss,"david", "things fall apart");
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.getBorrowers().show2();
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.lendOutBooks(Decagon.getBorrowers(), Decagon.getBooks());
//        Decagon.getBorrowers().show2();



    }

    //=========================================
    public static void printList( MembersArray memberss){
        Iterator iterator = memberss.getMembers().iterator();
        System.out.println("==============");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("==============");
    }




}
