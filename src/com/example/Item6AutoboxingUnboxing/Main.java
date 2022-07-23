package com.example.Item6AutoboxingUnboxing;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        Integer number = 1009; //pritimive variable --> Wrapper Class
        Integer number1 = 100;
        int autoboxing = number;//We automatically assigned from integer type to int type

        //example1
        String kelime = new String("Java");
        String kelime2= "Java";
        String kelime3 = "Java";

        System.out.println(kelime==kelime2); //false
        System.out.println(kelime2==kelime3); //true

        /*
        //example3
        ArrayList<Integer> integer= new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            integer.add(Integer.valueOf(i)); //autoboxing  primitive-->wrapper class,,, int-->Integer

        }

        for (int i=0; i<integer.size() ;i++){
            System.out.println(integer.get(i).intValue); //unboxing  wrapper class--> primitive
         */

        //check example2
        long start=System.nanoTime();
        topla();
        long end=System.nanoTime();
        long totalTime=end-start;
        System.out.println(totalTime);
        //809900

        //check example2
        long start2=System.nanoTime();
        topla2();
        long end2=System.nanoTime();
        long totalTime2=end2-start2;
        System.out.println(totalTime2);
        //5700
    }

    //example 2
    private static long topla(){
        Long sum =0L;
        for (int i =0 ;i<150 ;i++){
            sum+=i;
        }
        return sum;
    }

    private static long topla2(){
        long sum =0L;
        for (int i =0 ;i<150 ;i++){
            sum+=i;
        }
        return sum;
    }

}
