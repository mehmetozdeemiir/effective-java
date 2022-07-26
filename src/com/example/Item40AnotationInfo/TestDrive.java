package com.example.Item40AnotationInfo;


public class TestDrive {

    public static void main(String[] args) {

        TestDrive test = new TestDrive();

        // override

    }

    public void topla(int a, int b)
    {
        System.out.println(a+b);
    }

    public void topla(int a,int b, int c){
        System.out.println(a+b+c); //overload
    }

    public void topla(int a, double b)
    {
        System.out.println(a+b);
    }




}
