package com.decagonhq;

import java.util.Comparator;

public class BorrowerComparator implements Comparator<Members> {
    @Override
    public int compare(Members borrowers, Members borrowers2) {
        if(borrowers.getLevel() > borrowers2.getLevel()){
            return 1;
        }
        else if(borrowers.getLevel() < borrowers2.getLevel()){
            return -1;
        }
        return 0;
    }

}
