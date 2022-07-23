package com.example.Item15AccessModifiers;

public class GuvenliKod {

    private String asd= ""; //sınıf dışında erişilemez
    private void mesaj() {
        System.out.println("merhaba");//sınıf dışında erişilemez
    }
    private String a(){
        mesaj();
        return asd;
        //sınıf içerisinde erişilebilir.
    }

    protected void mesajj(){ //aynı paket içerisinden ve extend yada implement edildiği sınıfdan erişilir.
        System.out.println("merhaba");
    }

     void mesajjj(){ //erişim belirteci eklenmezse sadece aynı paket içerisinden erişilebilir.
        System.out.println("merhaba");
    }

    public static String a ="a";//paket bağımsız sınıf üzerinden erişilebilir oluyor.

    private static String b="b";//private static i ezmez yine sadece bulunduğu sınıf tarafından erişilebilir.

    public static final String c="c"; //başka sınıftan erişilebilir fakat değeri değiştirleme (immutable)

    public final void mesajjjj(){
        System.out.println("merhaba"); //bir metod final ise override edilemez.(immutable)
    }

    //bir sınıf final ise sınıf extend edilemez.(immutable)

    //abstract sınıfın nesnesi oluşturulamaz.
    //abstract metod yazmak istersek sınıfında abstract olması gerekli.


}
