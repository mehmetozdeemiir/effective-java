package com.example.Item2BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {

        //Constructor bu 3 değeri girebilmek için 3 adet constructor olusturmak zorunda kaldık.
        Product product=new Product("Leptop",15320L, "Dell");
        Product product2=new Product("Sweatshirt");
        Product product3=new Product("Klavye",1200L);


        //bu yapı daha esnek ve istediğimiz değeri alabiliyoruz ekstra bir çaba sarfetmeden
        //spring @Builder anotasyonu ile temelini yazmış olduğumuz işin tamamını kendi hallediyor ve bize bu yapıyı kullanmamızı sağlıyor.
        ProductBuilder pb= new ProductBuilder
                .Builder("Kokoreç")
                .brandVermekİsteyen("Midyeci Ahmet")
                .priceVermekİsteyenler(45L)
                .unitsInStockVermekİsteyen(4).build();

        ProductBuilder pb1= new ProductBuilder
                .Builder("Köşe Takımı")
                .brandVermekİsteyen("Bellona")
                .build();

        ProductBuilder pb3= new ProductBuilder
                .Builder("Şampanya")
                .build();





    }
}
