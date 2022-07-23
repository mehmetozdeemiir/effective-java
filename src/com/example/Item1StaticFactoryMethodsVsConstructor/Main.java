package com.example.Item1StaticFactoryMethodsVsConstructor;

public class Main {

    public static void main(String[] args) {

        Product product=new Product("Leptop",16800L);

        Product pb=Product.expensiveProduct("ütü");
    }
}
