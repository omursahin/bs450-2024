# Hafta 2 ÖDEV Defects, Infections ve Failures

Bu ödev, bu havuzun kod dizininde bulunan Gradle projesinin bir parçası olan 'DIF.java' sınıfını içerir. Bakınız
[`code/lib/src/main/java/bs450/DIF.java`](../code/lib/src/main/java/bs450/DIF.java).

Sınıf dört metot içermektedir: `findLast`, `countPositive`, `lastZero`, and
`oddOrPos`.

Her bir metotta kusur bulunmaktadır. Her kusur için JUnit testleri yazmanız gerekecek
ve bir düzeltme oluşturmanız gerekmektedir.
    
`DIF.java` sınıfındaki her bir metot için aşağıdaki görevleri tamamlamanız gerekmektedir: 
Yazdığınız testler  `DIFTest.java` isimli bir sınıfa eklenmelidir. (Not:
Testleri isimlendirirken, `[methodName]` testi yazdığınız metot adı ile değiştirilmelidir.)

1. (a) Kusur nedir ve nerede bulunmaktadır?

   (b) Hangi koşullar altında yönteme yapılan girişler metodun başarısız olmasına neden olur?

   (c) Yöntemin başarısız olmasına neden olan BİR JUnit test senaryosunu yazın.
   Bu metot`[methodName]_failure` olarak isimlendirilmelidir. (Testin de başarısız olması gerektiğini unutmayın; yani test, yöntemin _doğru_ davranışına ilişkin bir iddiaya (assert) sahip olmalıdır.)

2. (a) Yönteme yapılan girişlerin kusuru _yürütmemesi_ mümkün müdür? Eğer öyleyse, bunun gerçekleşmesine neden olacak yöntemin girdileri için gerekli koşulları açıklayın.

   (b) Mümkünse ((a) kısmına verdiğiniz cevaba göre), bu sorunun (a) kısmındaki senaryoyu gösteren bir JUnit test senaryosu yazın. 
   Bu metot `[methodName]_defectNotExecuted` olarak isimlendirilmelidir.

3. (a) Bir girdinin kusuru yürütmesi ancak programın durumunu etkilememesi mümkün müdür? Eğer öyleyse, bunun gerçekleşmesine neden olacak yöntemin girdileri için gerekli koşulları açıklayın.

   (b) Mümkünse ((a) kısmına verdiğiniz cevaba göre), bu sorunun (a) kısmındaki senaryoyu gösteren bir JUnit test senaryosu yazın. 
   Bu metot `[methodName]_defectExecuted_noInfection` olarak isimlendirilmelidir.

4. (a) Bir girdinin enfeksiyona neden olması ancak yöntemin başarısız olmasına neden olmaması mümkün mü? (Program ifadelerinin enfeksiyon olarak sayılmaması gerektiğinde yürütüldüğünü unutmayın.) Eğer öyleyse, bunun gerçekleşmesine neden olacak yöntemin girdileri için gerekli koşulları açıklayın.

   (b) Mümkünse ((a) kısmına verdiğiniz cevaba göre), bu sorunun (a) kısmındaki senaryoyu gösteren bir JUnit test senaryosu yazın. Bu metot `[methodName]_defectExecuted_infectionCaused_noFailure` olarak isimlendirilmelidir.


5. Kusuru düzeltin ve düzeltilen metodu `DIFFixed.java` adlı sınıfa ekleyin. (Soru 1 kapsamında yazdığınız testin, metodun düzeltilmiş versiyonuyla çalıştırıldığında başarılı olduğundan emin olun.)
