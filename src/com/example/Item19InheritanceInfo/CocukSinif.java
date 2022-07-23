package com.example.Item19InheritanceInfo;

//base classın constructoruna abstacy metod verilirse sorun. Child class run edildiğinde önce base classdaki constructor çalışıyor.
public class CocukSinif extends AnaSinif{

    final int deger;
    public CocukSinif(int deger){
        this.deger=deger;
    }
    @Override
    void overrideMe() {
        System.out.println(deger);
    }

    public static void main(String[] args) {
        CocukSinif cocuk=new CocukSinif(42);
    }

}
