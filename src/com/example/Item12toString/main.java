package com.example.Item12toString;

public class main {
    public static void main(String[] args) {

        //bad
        Request as = new Request();
        as.setBody("Body");
        as.setHeader("Header");

        System.out.println(as.toString()); // com.example.Item12toString.Request@4dd8dc3 döndü anlamsız sekilde
        //@4dd8dc3 hash codunun hexadecimal karşılığında gösterimi


        //good
        RequestToString sa= new RequestToString();
        sa.setBody("Body");
        sa.setHeader("Header");

        System.out.println(sa.toString()); //RequestToString{header='Header', body='Body'}


    }

}
