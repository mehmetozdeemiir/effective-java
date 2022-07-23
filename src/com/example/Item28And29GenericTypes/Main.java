package com.example.Item28And29GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //---> Generic Tanımlama İşlemi <---\\
        List<String> listGenericExample = new ArrayList<>();
        listGenericExample.add("String Bir Tanımlama İşlemi Gerçekleştiriyorum.");
        //listGenericExample.add(100); //--> Kullandığımız ide zaten bir hata yaptığımızı bize bu esnada gösterecektir.
        System.out.println("----------------\n<Generic Yapıda Derleme Aşaması>\n----------------");
        for(int i=0;i<listGenericExample.size();i++)
            System.out.println("-> "+listGenericExample.get(i)+"\n----------------");



        //		Object[] objectArray = new Long[1];
//		objectArray[0] = true;


//		List<Object> ol = new ArrayList<Long>(); // Uyumsuz türler.
//		ol.add(1L);


        /**
         * Dizilerde Object[] -> Long[] 'un süper sınıfıdır.
         * Ancak List<Object> -> List<String> arasında böyle bir bağlantı söz konusu olamaz. Generic bizi kurtarıyor!
         *
         * Genericleri arraylere tercih etmek bizi kurtarır.
         */


        // arrayler -> run time da tür güvenliği ancak derlemede sağlamaz
        // genericlerde bunun tam tersi geçerli.
        // Listleri tercih etmeliyiz.
       // Java Generic, programlarımız içerisinde farklı referans veri tiplerine ev sahipliği yapacak işlemlerimize, üzerinde hangi referans tiplerini taşımasını istediğimize karar vermemize olanak sağlayan bir sınıftır.
    }


}
