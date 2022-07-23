package com.example.Item20And21AbstractVsInterface;

public interface SarkiYazari {
    public void sarkiYaz();

    default boolean siirYazabiliyormu(){
        return true; //default olduğu için override etmek zorunlu değil fakat erişim var;
        //bu özelliğe güvenip baştan sağma yapılmaması gerekli.
    }
}
