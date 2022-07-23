package com.example.Item5DependencyInjection;

public class YaziAnaliziSingleton {

    //temel özelliği tek bir instance olacak ve onun üzerinden çalışacak.

    private static final Sözlük turkce = new Sözlük("Türkçe");

    public static YaziAnaliziSingleton INSTANCE= new YaziAnaliziSingleton();

    private YaziAnaliziSingleton(){
    }

    public boolean isValid(){
        return true;
    }
}
