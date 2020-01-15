package com.decagonhq;

import java.awt.datatransfer.FlavorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MembersArray {
    private ArrayList<Members> members;

    public ArrayList<Members> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Members> members) {
        this.members = members;
    }

    public MembersArray() {
        this.members = new ArrayList<Members>();
    }

    public boolean addMember(String name, String level){
        if(findMember(name) == null){
            this.members.add(new Members(name, level));
            return true;
        }
        return false;
    }

    private Members findMember(String name){
        for(Members checkedMember: this.members){
            if(checkedMember.getName().equals(name)){
                return checkedMember;
            }
        }
        return null;
    }

}
