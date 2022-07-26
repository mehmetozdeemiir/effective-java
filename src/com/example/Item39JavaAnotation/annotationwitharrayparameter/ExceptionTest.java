package com.example.Item39JavaAnotation.annotationwitharrayparameter;

import java.lang.annotation.*;

//Annotation type with an array parameter  (Page 184)
@Retention(RetentionPolicy.RUNTIME)//// çalışma zamanında korunması gerektiğini belirtmektedir
@Target(ElementType.METHOD)// bu notasyonun sadece metotlar üzerinde kullanılabileceğini belirtmektedir.
public @interface ExceptionTest {
    Class<? extends Exception>[] value();
}