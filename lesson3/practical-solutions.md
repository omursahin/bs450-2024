# Daha İyi Birim Testler — Cevaplar

### `shouldNotLoginBannedUser`

Problemler:

* "Testleri Tamamla" ilkesini ihlal ediyor –Forumun ve kullanıcılarının ayrıntıları 'makeForum' yardımcı yönteminde gizlenir.
Testin içerisine dahil edilmelidir (DRY değil DAMP prensibi).

* "Testleri Kısa Hale Getirin" ilkesini ihlal eder – `makeForum` yardımcı yönteminde testin ihtiyaç duyduğundan daha fazla kullanıcı kayıtlıdır.

**Tekrar yazılmış test için:** Bakınız [`ForumTest_Better`](../code/lib/src/test/java/bs450/forum/ForumTest_Better.java) içinde `shouldNotLoginBannedUser`.

### `shouldGetRegisteredUser`

Problemler:
* `getUser`, public bir metot değil, pakete özel bir metottur. Test kırılganlığa eğilimlidir ve "Yalnızca public metotları çağırarak test edin" ilkesini ihlal eder.

**Tekrar yazılmış test için:** Bakınız [`ForumTest_Better`](../code/lib/src/test/java/bs450/forum/ForumTest_Better.java) içinde `shouldGetRegisteredUser`.

### `testBan`

Problemler:

* "Testleri Tamamla" ilkesini ihlal eder - forumun ve kullanıcılarının ayrıntıları `makeForum` yardımcı yönteminde gizlenir. 
Teste dahil edilmelidirler (DRY değil DAMP prensibi).

* "Testleri Kısa Yap" ilkesini ihlal ediyor - `makeForum` yardımcı yönteminde kesinlikle ihtiyaç 
duyulandan daha fazla kullanıcı kayıtlı (yasaklama davranışını test etmek için birden fazla 
kullanıcıyı kaydetmemize ve onları yasaklamamıza gerek yok).

* "Testlere Mantık Koymayın" ilkesini ihlal ediyor. Test iki adet `for` döngüsü içerir.

* Test davranış odaklı değildir çünkü:
  
  (1) adı `testBan` olup, görünüşe göre Forum'un `ban` yöntemini hedef alıyor ve 
   "Yöntemleri Test Etme - Davranışları Test Et" ilkesini ihlal ediyor.

  (2) `testBan` yönteminin sonucunu, kullanıcının özel paket yöntemini (`isBanned`) çağırarak kontrol 
   eder; bu, "Yalnızca public yöntemleri çağırarak test et" ilkesini ihlal eder.
  
  (3) Açıklık eksikliği - Given X, When Y, Then Z" yapından uzaktadır. 

**Tekrar yazılmış test için:** Bakınız [`ForumTest_Better`](../code/lib/src/test/java/bs450/forum/ForumTest_Better.java) içinde `shouldNotLetBannedUsersPost`.
Burada orijinal testi, yasaklı bir kullanıcının paylaşım yapıp yapamayacağı (yapamamaları gerekir) davranışını test eden bir testle değiştiriyoruz.

### `testGetMostProfilicPoster` 

* "Testleri Tamamla" ilkesini ihlal eder - forumun ve kullanıcılarının ayrıntıları `makeForum` ve
  `makePosts` yardımcı yönteminde gizlenir. Teste dahil edilmelidirler (DRY değil DAMP prensibi).

  Ayrıca assertion, en üretken post atan için tam olarak 2 gönderiyi kontrol ediyor, ancak 2 sayısının 
  nereden geldiği belli değil. Bunun nedeni `makePosts` yardımcı yönteminde gizlidir.

* "Testleri Kısa Hale Getir" ilkesini ihlal ediyor - `makeForum` yardımcı yöntemine, testin ihtiyaç duyduğundan daha fazla kullanıcı kayıtlı.

* Yöntem, "Yalnızca genel yöntemleri çağırarak test et" ilkesini ihlal eden, User - `numPostsMade` özel paket yöntemini çağırır. Bu, bu testte 
yapılması gereken gereksiz bir şey gibi görünüyor ve ayruca "Testleri Tamamla" ilkesini de ihlal ediyor.
  
* Test davranış odaklı değildir çünkü:

  (1) adı `testGetMostProfilicPoster` olup, görünüşe göre Forum'un `getMostProlificUser` yöntemini hedef alıyor ve 
   "Yöntemleri Test Etme - Davranışları Test Et" ilkesini ihlal ediyor.

  (2) "Given X, When Y, Then Z" yapısına sahip olsa da, testin yorumlarında bu daha açık hale getirilebilir.

**Tekrar yazılmış test için:** Bakınız [`ForumTest_Better`](../code/lib/src/test/java/bs450/forum/ForumTest_Better.java) içinde `shouldComputeMostProlificPoster`.

