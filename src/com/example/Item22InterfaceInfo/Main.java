package com.example.Item22InterfaceInfo;

public class Main {
    public static void main(String[] args) {

        UcmaYetisi uy= new Kus(); //cikSesi metoduna erişilemez referansı farklı
        uy.ucuyorum();

        Kus ks=new Kus();
        ks.cikSesi();





    }
}
