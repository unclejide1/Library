package com.decagonhq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MembersArrayTest {

    @Test
    void getMembers() {
    }

    @Test
    void setMembers() {
    }

    @Test
    void addMember() {
        MembersArray members = new MembersArray();
//        members.addMember("jide", 1);
//        members.addMember("john", 1);
//        members.addMember("jide", 1);
//        assertEquals(2, members.getMembers().size());
        assertTrue(members.addMember("jide", 1));
        assertFalse(members.addMember("jide", 1));

    }
}