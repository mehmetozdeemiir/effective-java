package com.example.Item17ImmutableMutable;

//mutable ıcındekı ornek ıcın burayı final isaretlemedim
public class Immutable {

    private final int value;

    public Immutable(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    } //read only
}
