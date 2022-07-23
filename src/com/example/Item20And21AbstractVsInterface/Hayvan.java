package com.example.Item20And21AbstractVsInterface;

//abstract sınıfların abstract metodları implement edilmek zorundadır.
//bir class a abstract metod yazıyosak bulunduğu classında abstract olması gerekli.
//abstract classlar ise objenin karakteristik özelliklerini barındırır daha çok
public abstract class Hayvan {

    abstract void sesCikar();

    public void nefesAl(){
        System.out.println("nefes alıyorum");
    }
}
