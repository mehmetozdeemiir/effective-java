package com.example.Item3SingletonDesignPattern;

import java.util.HashMap;

//Lazy ve Eager da bir adet private constructor ve bunu çağıran bir metodu olmak zorunda fakat Enum yapısında bunlara gerek yok

public enum CacheSingletonEnum implements Cache {
    INSTANCE;

    private HashMap<Object,Object> map = new HashMap<Object,Object>();

     @Override
    public void put(Object key, Object value) {
        map =new HashMap<Object,Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
}
