package com.example.Item26RawTypes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> isimListesi = new ArrayList<>();
        isimListesi.add("Furkan");
        isimListesi.add("James");
        //isimListesi.add(Boolean.FALSE); //bad


        String isimAl = (String) isimListesi.get(1);///cast etsek bile işe yaramıyor hata fırlatıyor.

        System.out.println(isimAl);
    }
}
