package com.example.Item10And11OverridingEqualsAndHashCode;

public class DenemeSinifEquals {
    private int a;
    private int b;

    public DenemeSinifEquals(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DenemeSinifEquals)) return false;
        DenemeSinifEquals that = (DenemeSinifEquals) o;
        return a == that.a && b == that.b;
    }




}
