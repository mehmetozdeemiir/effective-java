package com.example.Item17ImmutableMutable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Mutable - Immutable nedir?
        //Bir nesne olusturulduğunda o nesnenin değerini değiştirebiliyorsanız Mutable değiştiremiyorsanız Immutable


        //Immutable
        String isim = new String("Mehmet");
        System.out.println(isim.toLowerCase());
        System.out.println(isim);//değişmedi

        //Mutable
        Date date = new Date();
        System.out.println(date);

        date.setDate(7); //ana objenin değeri değişmiş oluyor.Date yerine local date kullanımı öneriliyor.
        System.out.println(date);

        //Immutable
        LocalDate localDate= LocalDate.now();
        System.out.println();

        localDate.plusDays(1); //bunu basarsak arttırır ama ana objenın değerini değiştirmiyor.
        System.out.println(localDate);




    }
}
