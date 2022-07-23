package com.example.Item16Encapsulation;

public class Main {
    public static void main(String[] args) {

        Futbol fb = new Futbol("Fenerbahçe", 35);

        //fb.takimAdi="Gs"; //eğer fieldlar public olursa doğrudan erişilebilir.
        fb.getTakimAdi();
        fb.setTakimOyuncuSayisi(99);





    }
}
