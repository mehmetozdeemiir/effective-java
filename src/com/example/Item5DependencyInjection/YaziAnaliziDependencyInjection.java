package com.example.Item5DependencyInjection;

public class YaziAnaliziDependencyInjection {

    private final Sözlük sözlük;

    public YaziAnaliziDependencyInjection(Sözlük sözlük){
        this.sözlük=sözlük;
    }

    public boolean isValid(){
        return true;
    }
}
