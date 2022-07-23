package com.example.Item2BuilderDesignPattern;

public class Product {

    //gerekli
    private String productName;

    //seçime göre değişken
    private Long price;
    private String brand;
    private Integer unitsInStock;

    public Product(String productName){
        this.productName=productName;
    }

    public Product(String productName,Long price){
        this.productName=productName;
        this.price=price;
    }

    public Product(String productName,Long price,String brand){
        this.productName=productName;
        this.price=price;
        this.brand=brand;
    }

    //fieldaları isteğimize göre kullanmak için sürekli olarak constructor acmak zorunda kalabiliriz builder bunun önüne geçiyor.
    //telescope pattern deniliyor bu yönteme.!!
}
