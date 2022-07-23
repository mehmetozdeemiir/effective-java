package com.example.Item24InnerClass;

public class Main {
    public static void main(String[] args) {

		/*
		 * statik olan iç içe geçmiş sınıflar (static nested classes)
		   statik olmayan iç içe geçmiş sınıflar (non-static nested classes)
		   yerel sınıflar (local classes)
		   anonim sınıflar (anonymous classes)
		 *
		 */


//		// Static Nested
		StaticNested.staticNestedClass nesne = new StaticNested.staticNestedClass();
			// HesapMakinesi.Operasyon.TOPLA
			// Builder Ders2



//		// Non Static Nested
//		// Open for a memory leak..

		NonStaticNested nonStatic = new NonStaticNested();//ana sınıf nesnesi
	    NonStaticNested.NonStaticNestedClass nesne2 = nonStatic.new NonStaticNestedClass(); //ana sınıfın instanceını kullanıp tekrardan nesne olusturuyor buda bağımlılığa sebep oluyor memory açısından kötü(Ana sınıfa baımlılık var)
		nesne2.yazBunu();

        // Local classes
        LocalClass lc = new LocalClass();


        //Anonim
        SuperClass sc = new SuperClass() {
            @Override
            public void yazBeni() {
                System.out.println("anonim"); //bunu yazdı ana sınıftaki değeri yazmadı
            }
        };

        sc.yazBeni();



        SuperClassDerin scd = new SuperClassDerin() {
            @Override
            public void yazBeni() {
            }
        };
        scd.yazBeni();


    }
}
