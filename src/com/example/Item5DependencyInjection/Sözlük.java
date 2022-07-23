package com.example.Item5DependencyInjection;

public class Sözlük {

    private String dil;

    public Sözlük(String dil){
        this.dil=dil;
    }

    @Override
    public String toString(){
        return dil;
    }
}
