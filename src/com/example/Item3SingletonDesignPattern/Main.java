package com.example.Item3SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {

        DefineSingleton ds= DefineSingleton.ds; //dont use
        DefineSingleton ds2= DefineSingleton.getInstance();

        System.out.println(ds.hashCode());
        System.out.println(ds2.hashCode());


        System.out.println("bühürüs");


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e){

                }
                System.out.println("HashCode of Lazy: "+LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager: "+EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum: "+CacheSingletonEnum.INSTANCE.hashCode());

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HashCode of Lazy: "+LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager: "+EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum: "+CacheSingletonEnum.INSTANCE.hashCode());
            }
        }).start();






    }
}
