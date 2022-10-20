package com.example.Item42LambdasToAnonymous;

public class Main {

    public String exampleFour(){
    return "ornek";
}
    public static void main(String[] args) {

        //lambda : kendi başına tanımlanabilen , parametre kabul eden ve döndürülebilen fonksiyondur.

        Yazdir y= ()->{
            return "yazdim";
        };
        System.out.println(y.yazBeni());


        String param ="Parametre";
        YazdirParametre y2=(paramAlacak)->{
            return paramAlacak + " selam";
        };
        System.out.println(y2.yazdirParametreyi(param));



        Main ma=new Main();
        Yazdir write =ma::exampleFour;
        System.out.println(write.yazBeni());
    }
}
