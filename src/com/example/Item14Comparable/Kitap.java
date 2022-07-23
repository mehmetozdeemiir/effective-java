package com.example.Item14Comparable;

//comparable interface i artık bu sınıfın instancelerini bir sıraya sokabiliyor, kıyaslayabiliyor hale getirir
public class Kitap implements Comparable<Kitap>{

    private String isim;
    private int sayfa;

    public Kitap(String isim, int sayfa) {
        this.isim = isim;
        this.sayfa = sayfa;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSayfa() {
        return sayfa;
    }

    public void setSayfa(int sayfa) {
        this.sayfa = sayfa;
    }

    @Override
    public int compareTo(Kitap o) {
        return this.sayfa - o.sayfa; //sayfa sayılarına gore sıralama
    }

    @Override
    public String toString() {
        return "Kitap [isim=" + isim + ", sayfa=" + sayfa + "]";
    }

}
