package com.example.Item1StaticFactoryMethodsVsConstructor;


//Constructorlarda istediğiniz ismi vermek gibi bir seçeneğiniz olmaz.
//durmadan yeni instance ürettiğimzide cacheleme gibi mekanızma kurma sansınız yok.
//Constructorlar ile alt tipte veya farklı tipte bir obje üretemeyiz.
//Constructorların aksine her çağrıldıklarında yeni bir nesne oluşturmaları gerekmez.

public class Product {

    private String productName;
    private Long price;

    public Product(String productName, Long price){
        this.productName=productName;
        this.price=price;
    }

    public static Product expensiveProduct(String productName){
        return new Product(productName,95000L);
    }
}
