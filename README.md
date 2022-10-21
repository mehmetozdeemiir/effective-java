# Effective Java kitabından aldığım notlar

- Consturtorlar yerine static factory methodları tercih edilebilir.
- Static factory methodları Constructorların aksine her çağırıldığında yeni bir instance oluşturması gerekmez.
- Çok sayıda parametreyle karşılaştığınızda builder kullanın.
- Üst üste Consturtorlar oluşturmamak için Builder kullanılabilir(Telescope Patterndan kaçınmak).
- Singleton sınıfları private yapıcı metot veya enum türüyle güçlendirin.
- Utility sınıflar projede bir çok yerde kullanacağımız metodları barındırır metodları static işaretlenir.
- Utility sınıflardan nesne oluşturulması uygun görülmez. Bir sınıfın nesnesini oluşturmayı engellemek isterek boş bir private constructor tanımlayabiliriz.
- Utility sınıfları abstract yapmayın. Abstract sınıfın nesnesi oluşturulamaz fakat extend eden bir alt sınıfın
  nesnesini oluşturabilirsiniz buda bizi yanlış yönlendirebilir.
- Bağımlılıkları kendimiz yaratmak yerine Dependency Injection kullanırız. Sigletondan daha kolay ve efektif.

- Gereksiz nesne yaratmaktan kaçınılmalıdır. Örneğin:
  String c = new String("abc"); -- String d = new String("abc"); -- System.out.println(c == d);  // False döner

- Equals() iki nesnenin referansının aynı olup olmadığını kontrol eder.
- Bir anlaşma olarak equals metodunun override edildiği her sınıftta hashCode metodu da override edilmelidir.
- Sadece equals metodunu override edersem nesnelerim equals metodu ile eşit görünse de hash kod  değerleri farklı olacak.
- Sadece hashCode metodunu override edersem nesnelerim aynı hash code değerine sahip olmasına rağmen equals metodu bu 2 nesnesin farklı olduğunu söyleyecek.
- toString() metodu Object sınıfında tanımlanmış bir metottur ve nesnelerin metin karşılıklarını ekrana yazmak için kullanılır. Eğer nesnelerin metinsel bir karşılığı yoksa nesnenin hafızadaki adresini döndürür.
- toString() kullanılmamış bir sınıfda objenin çıktısı hashCode un hexadecimal karşılığında gösterimi olur.
- Comparable interfacei sınıfın instancelerini bir sıraya sokabiliyor, kıyaslayabiliyor hale getiriyor.
- Comparable interfacesini uygulayarak, sınıfınızın nesneleri arasında sıralama yapılabileceğini belirtmiş olursunuz. Bu arayüzü uygulayan nesnelerden oluşan bir diziyi sıralamak çok kolaydır.
- Sınıf final ise sınıf extend edilemez.(immutable)
- Method final ise override edilemez.(immutable)
- public static final String c="c"; //başka sınıftan erişilebilir fakat değeri değiştirleme (immutable)
- private static String b="b";//private static i ezemez yine sadece bulunduğu sınıf tarafından erişilebilir.
- Protected: aynı paket içerisinden ve extend yada implement edildiği sınıfdan erişilir.
```bash
  Encapsulation veriyi kontrollü tutmamızı sağlar.

  1- Doğrudan erişilebilirlik kalkar(get set ile dolaylı erişim)

  2- Set ile verilerimde kontrol sağlayabliyorum.

  3- Read only (set kaldırmak istenirse)

  4- Write only(get kaldırmak istenirse)
``` 

- Bir nesne oluşturulduğunda o nesnenin değerini değiştirebiliyorsanız Mutable değiştiremiyorsanız Immutable.
- Abstract sınıfların abstract metodları implement edilmek zorundadır.
- Bir classa abstract metod yazıyosak bulunduğu classında abstract olması gerekli.
- Abstract classlar ise objenin karakteristik özelliklerini barındırır daha çok.
- Interfaceler özellikleri temsil eder, neler yapabileceğini söyler.
- Interface'e yazılan  bütün metodlar override edilmek zorundadır ve metodun içi boş bırakılır override edildiği yerde doldurulur.
- default isaretlenirse override edilme zorunlulugu yok fakat child classslarda kullanılabilir.
- Ham (raw) türleri kullanılmamalı.
- Stream nedir? -> Java8 + sıralı paralel toplu işlemleri kolaylaştırmak için gelmiştir.
- Generic method compile time da tip güvenliği,autoboxing unboxing gibi cast operasyonlarının önüne geçmemizi ,daha esnek bir yapı sağlıyor.
- Listeleri dizilere tercih edin.
- Lambda : kendi başına tanımlanabilen , parametre kabul eden ve döndürülebilen fonksiyondur.
- Metot referanslarını lambdalara tercih edin
-  Klasik for döngüleri yerine for-each tercih edilmeli.

