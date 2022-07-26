package com.example.Item39JavaAnotation.markerannotation;

//Marker annotation type declaration - Page 180
import java.lang.annotation.*;

/**
 * Indicates that the annotated method is a test method. Use only on
 * parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {

}