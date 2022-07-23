package com.example.Item16Encapsulation;

public class Futbol {

    //encapsulation veriyi kontrollü tutma
    //1-> Doğrudan erişilebilirlik kalkar(get set ile dolaylı erişim)
    //2-> Set ile verilerimde kontrol sağlayabliyorum.
    //3-> read only (set kaldırmak istenirse)
    //4-> write only(get kaldırmak istenirse)

    private String takimAdi;
    private int takimOyuncuSayisi;

    public Futbol(String takimAdi, int takimOyuncuSayisi) {
        this.takimAdi = takimAdi;
        this.takimOyuncuSayisi = takimOyuncuSayisi;
    }

    public String getTakimAdi() {
        return takimAdi;
    }

    public void setTakimAdi(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    public int getTakimOyuncuSayisi() {
        return takimOyuncuSayisi;
    }

    public void setTakimOyuncuSayisi(int takimOyuncuSayisi) {
        this.takimOyuncuSayisi = takimOyuncuSayisi;
    }
}
