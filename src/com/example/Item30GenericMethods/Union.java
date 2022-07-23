package com.example.Item30GenericMethods;

import javax.swing.text.StyledEditorKit;
import java.util.HashSet;
import java.util.Set;

public class Union {
    //access modifier <convertion> dönüşTipi methodName(parametre)
    public static <E> Set<E> union(Set<E> s1,Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <T extends Number> int topla(T deger1,T deger2){
        return deger1.intValue()+deger2.intValue();
    }

    public static void main(String[] args) {
        Set<Integer> fenerbahce =Set.of(1,2,3);
        Set<Integer> turkiye =Set.of(3,4,5);//bu method Integerda olabilir Double da Generic bize burda yardımcı oluyor set kullandığımız içinde tekrarlanan kayıdı koymuyor.

        Set<Integer> birlesim=union(fenerbahce,turkiye);
        System.out.println(birlesim);

        topla(44,44.4); //String veya Boolean değer veremiyorum Numberdan extend ettik ve T nin kullanımını da görmüş olduk.
    }
}
