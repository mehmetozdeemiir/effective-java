package com.example.Item24InnerClass;

public class NonStaticNested {

    private String sözcük = "Sözcük"; //private a erişim var inner classda

    public class NonStaticNestedClass
    {

        public void yazBunu()
        {
            System.out.println(sözcük);
        }

    }

}