package com.example.Item8And9TryCacthFinallyVsTryWithResource;

public class Main {
    public static void main(String[] args) {

/*
        try{
            int data =25 /0 ;
            System.out.println(data);
        }
        catch (NullPointerException e){
            System.out.println("Java");
        }
        finally {
            int data=25/0;
            System.out.println("ben hep çalışırım");
        }

        //Exception in thread "main" java.lang.ArithmeticException: / by zero //catch e girmiyor


 */
        try{
            int data =25 /0 ;
            System.out.println(data);
        }
        catch (NullPointerException e){
            System.out.println("Java");
        }
        finally {
            //int data=25/0;
            System.out.println("ben hep çalışırım");
        }
        //ben hep çalışırım
        // Exception in thread "main" java.lang.ArithmeticException: / by zero //yine catch e dusmedı


    }
}
