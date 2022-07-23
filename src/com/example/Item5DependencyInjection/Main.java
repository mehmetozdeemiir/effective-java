package com.example.Item5DependencyInjection;

public class Main {
    public static void main(String[] args) {
        YaziAnaliziUtility.isValid(); //sadece türkçe için çalışacak esneklik yok.

        YaziAnaliziSingleton.INSTANCE.isValid();

        YaziAnaliziDependencyInjection dependency=new YaziAnaliziDependencyInjection(new Sözlük("ingilizce vvssvsv"));

        dependency.isValid();

    }
}
