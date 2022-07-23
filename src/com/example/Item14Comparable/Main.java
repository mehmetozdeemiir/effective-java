package com.example.Item14Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

            ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();

            kitapListesi.add(new Kitap("Effective Java", 500));
            kitapListesi.add(new Kitap("Clean Code", 200));
            kitapListesi.add(new Kitap("Ab", 200));


            Collections.sort(kitapListesi); //sort kullanımı için Comparable kullanılması gerekli(nasıl sıralanması geretiği kuralı verildi)

            System.out.println("Sıralama1");
            for (Kitap kitap : kitapListesi) {
                System.out.println(kitap.toString()); }

        //Kitap [isim=Clean Code, sayfa=200]
        //Kitap [isim=Ab, sayfa=200]
        //Kitap [isim=Effective Java, sayfa=500] sıralama kücükten büyüğe yapıldı.

            // Sıralama 2
            System.out.println("Sıralama2");
            IsimKiyaslama ismeGöre = new IsimKiyaslama();
            Collections.sort(kitapListesi, ismeGöre);
            for (Kitap kitap : kitapListesi) {
                System.out.println(kitap.toString());
            }

            //Kitap [isim=Ab, sayfa=200]
            //Kitap [isim=Clean Code, sayfa=200]
            //Kitap [isim=Effective Java, sayfa=500]
        }
    }

