package com.example.Item13ShallowCopy;


public class Main {
    public static void main(String[] args) {

        //Shallow Copy
        Stack st = new Stack();
        Stack st1 =st;

        System.out.println(st==st1); //true

        //Deep Copy
        Stack stc = new Stack();
        stc.stackName="Mehmet";

        Stack stc2= new Stack();
        stc2.stackName= stc.stackName;


    }
}
