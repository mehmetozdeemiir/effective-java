package com.example.Item14Comparable;

import java.util.Comparator;

public class IsimKiyaslama implements Comparator<Kitap> {

    public int compare(Kitap m1, Kitap m2) {
        return m1.getIsim().compareTo(m2.getIsim());
    }
}
