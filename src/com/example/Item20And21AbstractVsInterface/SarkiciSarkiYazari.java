package com.example.Item20And21AbstractVsInterface;
// yazılan  bütün metodlar override edilmek zorundadır ve metodun içi boş bırakılır override edildiği yerde doldurulur.
//default isaretlenirse override edilme zorunlulugu yok fakat child classslarda kullanılabilir.
public interface SarkiciSarkiYazari extends Sarkici ,SarkiYazari{

    public void calBiseyler();
}
