package com.example.Item10And11OverridingEqualsAndHashCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        //integer type
        System.out.println(10==20); //referance type comparison
        //char type
        System.out.println('a'=='b');//referance type
        //char and double type
        System.out.println('a'==97.0);
        //boolean type
        System.out.println(true==true); //referance type

        System.out.println("aaaaaa");
        System.out.println((int) 'a' ); //cast char to int
        System.out.println('a'==97); //char is automatically promoted to int
        System.out.println('a'+1); //char is automatically promoted to int
        System.out.println((char) 98); //cast int to char

        DenemeSinif d = new DenemeSinif(1,2);
        DenemeSinif d2 = new DenemeSinif(1,2);
        System.out.println(d==d2); //false  stack de ayrı sekilde referans tutulur.
        System.out.println(d.equals(d2)); //false
        System.out.println(d.hashCode());//different to d2 hashcode
        System.out.println(d2.hashCode());//different to d1 hashcode

        DenemeSinif deneme= new DenemeSinif(10,11);
        DenemeSinif deneme2= new DenemeSinif(10,11);

        if(deneme.equals(deneme2))
            System.out.println("equal");
            else
            System.out.println("not equal");//this

        List<DenemeSinif> list = new ArrayList<>();
        DenemeSinif r= new DenemeSinif(3,4);
        list.add(r);
        System.out.println(list.contains(new DenemeSinif(3,4))); //false döner equal yok


        DenemeSinifEquals deneme3= new DenemeSinifEquals(10,11);
        DenemeSinifEquals deneme4= new DenemeSinifEquals(10,11);

        if(deneme3.equals(deneme4))
            System.out.println("equal");//this
        else
            System.out.println("not equal");

        System.out.println(deneme3.equals(deneme4));//true


        List<DenemeSinifEquals> list2 = new ArrayList<>();
        DenemeSinifEquals e= new DenemeSinifEquals(3,4);
        list2.add(e);
        System.out.println(list2.contains(new DenemeSinifEquals(3,4))); //true döner equal var

        /*
        reflexive: an object must equal itself x.equal(x)
        symmetric: x.equals(y) must return the same result as y.equals(x) : (deneme3.equals(deneme4) $ (deneme4).equals(deneme3)
        transitive: if x.equals(y) and y.equals(z) then also x.equals(z) deneme3 == deneme 4 || deneme 5 == deneme3
        consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
        null controll a.equals(null) //System.out.println(deneme3.equals(null)); her zaman false dönmelidir.

         */
        //  ******************************************HASH CODE**********************************************

        DenemeSinifEquals deneme5= new DenemeSinifEquals(10,11);
        DenemeSinifEquals deneme6= new DenemeSinifEquals(10,11);
        DenemeSinifEquals deneme7= new DenemeSinifEquals(10,11);

        System.out.println(deneme5.hashCode());//different hashcodes because there is no hashcode
        System.out.println(deneme6.hashCode());//different hashcodes because there is no hashcode
        System.out.println(deneme7.hashCode()); //different hashcodes because there is no hashcode

        Map<DenemeSinifEquals,String> m = new HashMap<>();
        m.put(new DenemeSinifEquals(1,2),"ilk eleman");
        System.out.println(m.get(new DenemeSinifEquals(1,2))); //null döner sınıfta hashcode yok.



        DenemeSinifEqualAndHashCode deneme8= new DenemeSinifEqualAndHashCode(10,11);
        DenemeSinifEqualAndHashCode deneme9= new DenemeSinifEqualAndHashCode(10,11);
        DenemeSinifEqualAndHashCode deneme10= new DenemeSinifEqualAndHashCode(10,11);

        System.out.println(deneme8.hashCode());//has the same hash code
        System.out.println(deneme9.hashCode());//has the same hash code
        System.out.println(deneme10.hashCode());//has the same hash code

        Map<DenemeSinifEqualAndHashCode,String> n= new HashMap<>();
        n.put(new DenemeSinifEqualAndHashCode(1,2),"ilk eleman");
        System.out.println(n.get(new DenemeSinifEqualAndHashCode(1,2))); //ilk eleman döner
    }
}
