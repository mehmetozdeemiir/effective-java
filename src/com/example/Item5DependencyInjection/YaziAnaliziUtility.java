package com.example.Item5DependencyInjection;

public class YaziAnaliziUtility {

    //temel özelliği başka classda newlenmez (private constructor)

    private static final Sözlük turkce = new Sözlük("Türkçe");

    private YaziAnaliziUtility(){
    }

    public static boolean isValid(){
        return true;
    }
}
