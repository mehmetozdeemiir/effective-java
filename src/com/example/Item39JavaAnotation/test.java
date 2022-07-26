package com.example.Item39JavaAnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)//runtime zamanında kornması gerektiğini söylüyor.
@Target(ElementType.FIELD) //ne üzerinde kullanılması gerektiğini belirtiyor. Source olursa calısmadan islem yapılacaktı hata verebilir mesela
public @interface test {

// notasyon nedir?

    /*
     * Bir veri hakkında bilgi barındırır ve veri sağlar. Konfigurasyon amaçlı kullanılır.
     */


    /*
     * Notasyondan öncesi: (--)
     * 	JUnit test çatısının 4. versiyondan önce test metotlarını algılayıp çalıştırabilmesi için metot isimlerinin
     * “test” ile başlaması gerekiyordu.
     *
     *	testSafetyOverride isimli bir test metodu yazmak isterken yanlışlıkla tsetSafetyOverride yazarsanız
     * 	JUnit 3 size bir uyarı vermez ama testi de çalıştırmaz.
     */


		/*
		   SOURCE: Notasyon derleyici tarafından atılır.
		   CLASS: Notasyon derleyici tarafından oluşturulan sınıf dosyasına kaydedilir ve JVM tarafından saklanması gerekmez. Varsayılan davranış biçimidir.
		   RUNTIME: Notasyon sınıf dosyasına derleyici tarafından kaydedilir ve çalışma zamanında JVM tarafından saklanır, böylece reflection ile okunabilir.
		 */


}
