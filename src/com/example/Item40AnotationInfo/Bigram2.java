package com.example.Item40AnotationInfo;


import java.util.HashSet;
import java.util.Set;

// Fixed Bigram class (Page 189)
public class Bigram2 {
    private final char first;

    public Bigram2(char first) {
        this.first = first;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + first;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bigram2 other = (Bigram2) obj;
        if (first != other.first)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Set<Bigram2> s = new HashSet<>();

        s.add(new Bigram2('a'));
        s.add(new Bigram2('a'));
        s.add(new Bigram2('c'));

        System.out.println(s.size()); //2 çıkıyor equals calısıyor burada overload etmeden hareket edildiği için equals metodu çalıştı.
    }
}