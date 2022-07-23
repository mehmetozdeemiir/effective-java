package com.example.Item17ImmutableMutable;

public class Mutable extends Immutable{

    private int realValue;

    public Mutable(int value) {
        super(value);
    }

    public int getValue(){
        return realValue;
    }

    public void setValue(int newValue){
        realValue=newValue;
    }

    public static void main(String[] args) {
        Mutable obj = new Mutable(4);
        Immutable immobj=(Immutable) obj;

        System.out.println(immobj.getValue());

        obj.setValue(8);
        System.out.println(immobj.getValue()); //private isaretlenseydi sınıf extend edemezdim ve daha sonrasında değerini değiştiremezdim
    }

}
