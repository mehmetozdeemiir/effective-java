package com.example.Item3SingletonDesignPattern;

public class DefineSingleton {

    public static DefineSingleton ds = new DefineSingleton(); //dont use

    private DefineSingleton(){

    }

    public static DefineSingleton getInstance(){
        return ds;
    }
}
