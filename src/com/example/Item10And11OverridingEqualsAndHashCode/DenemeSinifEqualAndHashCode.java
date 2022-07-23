package com.example.Item10And11OverridingEqualsAndHashCode;

import java.util.Objects;

public class DenemeSinifEqualAndHashCode {

    private int a;
    private int b;

    public DenemeSinifEqualAndHashCode(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DenemeSinifEqualAndHashCode)) return false;
        DenemeSinifEqualAndHashCode that = (DenemeSinifEqualAndHashCode) o;
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

     //bu hashcode yazımı çok daha performanslı
    /*
      @Override
    public int hashCode() {
        int result= Integer.hashCode(b);
        result=31*result+Integer.hashCode(a);
        return result;
    }
     */
}
