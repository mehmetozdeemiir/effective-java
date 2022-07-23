package com.example.Item2BuilderDesignPattern;

public class ProductBuilder {

    private String productName;

    private Long price;
    private String brand;
    private Integer unitsInStock;

    public static class Builder{

        private String productName;

        private Long price;
        private String brand;
        private Integer unitsInStock;

        public Builder(String productName){
            this.productName=productName;
        }

        public Builder priceVermekİsteyenler(Long price){
            this.price=price;
            return this;
        }

        public Builder brandVermekİsteyen(String brand){
            this.brand=brand;
            return this;
        }

        public Builder unitsInStockVermekİsteyen(Integer unitsInStock){
            this.unitsInStock=unitsInStock;
            return this;
        }

        public ProductBuilder build(){
            return new ProductBuilder(this);
        }
    }
    public ProductBuilder(Builder builder){
        productName=builder.productName;
        price=builder.price;
        brand=builder.brand;
        unitsInStock=builder.unitsInStock;

    }



}
