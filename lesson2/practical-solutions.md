# Hafta 2 ÖDEV Defects, Infections ve Failures

Aşağıdaki cevapların uygulamaları için [`DIFFixed.java`](../code/lib/src/main/java/bs450/DIFFixed.java) ve 
[`DIFTest.java`](../code/lib/src/test/java/bs450/DIFTest.java) sınıflarını inceleyin.

## findLast

1. (a) Döngüdeki durdurma kriteri `i > 0`, `i >= 0` olmalı. 

   (b) Bu, dizinin ilk öğesinin göz ardı edilmesine neden olur. Yani `y`, `x` dizisinin ilk elemanına eşit olduğunda yöntem başarısız olur.
   
   (c) Bakınız: `findLast_failure`

2. (a) Evet, `x`, `null` olduğunda.

   (b) Bakınız `findLast_defectNotExecuted`.

3. (a) Boş olmayan bir dizi için dizinin ilk öğesi kaçırıldığında enfeksiyon meydana gelir. Bu nedenle, (1) `x` boş olduğunda (sıfır uzunluk) VEYA (2) `y` `x`te olduğunda ancak `x`, `y`nin ilk öğesi olmadığında kusur yürütülür ancak bir enfeksiyon meydana gelmez. 

   (b) Yukarıdaki ikinci sebep için bakınız: `findLast_defectExecuted_noInfection`.

4. (a) Evet, `y`, `x`te olmadığında. Dizinin ilk elemanı atlanırken (bu nedenle bir enfeksiyon), y zaten x'in içinde değildir, dolayısıyla yöntem doğru sonucu döndürür ve herhangi bir hata olmaz.

   (b) Bakınız `findLast_defectExecuted_infectionCaused_noFailure`.

5. Bakınız [`DIFFixed.java`](../code/lib/src/main/java/bs450/DIFFixed.java).


## countPositive

1. (a) Metot sıfırları pozitif olarak saymaktadır. Bu kusur, if koşulunun bir parçası olarak yöntemin üçüncü satırındadır.
`if (x[i] > 0)` olmalıdır, `if (x[i] >= 0)` değil.

   (b) Yöntemin yanlış değeri döndürmesi için x dizisindeki sıfır değerler sayıma dahil edilir.

   (c) Bakınız `countPositive_failure`.

2. (a) Evet, girilen dizi boş veya sıfır uzunlukta olduğunda. Yani, if koşulunun hiçbir zaman yürütülmediği zaman.

   (b) Bakınız `countPositive_defectNotExecuted`.

3. (a) Dizi, öğelerinden biri için sıfır değerine sahip olur olmaz bulaşma meydana gelir. 
Dolayısıyla dizi sıfırdan farklı değerler içerdiğinde kusur gerçekten yürütülür ancak enfeksiyon olmaz.

   (b) Bakınız `countPositive_defectExecuted_noInfection`.

4. (a) Hayır. Bir `x` öğesi 0'a eşit olduğunda durum etkilenir, ancak her zaman `count` değişkeninin artırılmasına yol açar.
   Yöntem tarafından `count` döndürüldüğünden, bu enfeksiyon her zaman çıktıya yayılır.

   (b) 4 (a) uyarınca JUnit testi mümkün değildir..
   
5. Bakınız [`DIFFixed.java`](../code/lib/src/main/java/bs450/DIFFixed.java).


## lastZero

1. (a) Yöntem sonuncuyu değil ilk sıfırı döndürür. Elemanların ters sırada değerlendirilmesinde 
bir hata var. Bu, "kusurun" birden fazla yerden birinde olduğu şeklinde yorumlanabileceği anlamına 
gelir, örneğin:

      (1) for döngüsü başlığı, `i = x.length - 1` ile başlamalı ve `i = 0`'a kadar saymalıdır. 
      (Yani, tam döngü başlığı `for (int i = x.length-1; i >= 0; i--)` olmalıdır)

      (2) if koşulunda, `x[i]` yerine `x[x.length - i - 1]` olabilir ve doğru kısma dönüş ifadesi o zaman `return i+1` olur.
      Başka yorumlar da mümkündür.   

    (b) `x` dizisinde birden fazla sıfır varsa, yöntem son sıfırı döndürmez. İlk sıfırı döndürür.

    (c) `lastZero_failure`'a bakınız.

2. (a) Eğer kusur (1) ise, kusurun yürütülmemesi mümkün değildir, çünkü döngü başlığı `(int i=0)` her zaman yürütülür.
        Eğer kusur (2) ise, yönteme girişlerin kusuru yürütmemesi mümkündür. Yani, `x` dizisi boş olduğunda.
    
   (b) Kusur 2'ye göre bakınız `lastZero_defectNotExecuted`.

3. (a) Enfeksiyon, döngünün dizinin elemanlarını yanlış sırada değerlendirmeye başladığında meydana gelir.
    Eğer kusur (1) ise, enfeksiyon meydana gelir, çünkü döngü başlığı her zaman yürütülür.
    Eğer kusur (2) ise, enfeksiyon meydana gelir, çünkü döngü başlığı her zaman yürütülür.
    
   (b) Kusur 2'ye göre bakınız `lastZero_defectExecuted_noInfection`.

3. (a) Döngü, dizi değerlerini yanlış sırada dikkate almaya başladığında bir enfeksiyon meydana gelir. 
   Kusur (1) ise kusur yürütülür ancak dizinin bir değeri varsa enfeksiyon olmaz.

   Kusur (2) ise, kusur yürütülür ancak dizi en az bir değere sahip olduğu sürece enfeksiyon olmaz. 
   Dizinin tek değeri varsa sıfır olup olmamasının bir önemi yoktur.

   (b) Hata 2'ye dayalı olarak `lastZero_defectExeculated_noInfection`'a bakın. 

4. (a) Döngü, dizi değerlerini yanlış sırada dikkate almaya başladığında bir enfeksiyon meydana geldiğinden, dizi iki değere sahip olduğunda bir enfeksiyon meydana gelir. Bu öğelerden bir veya daha azının sıfır olması durumunda bir hata meydana _gelmez_.

   (b) Bakınız `lastZero_defectExecuted_infectionCaused_noFailure`.

5. Bakınız [`DIFFixed.java`](../code/lib/src/main/java/bs450/DIFFixed.java).

## oddOrPos

1. (a) Metot içerisinde, `x[i] % 2` ifadesi `Math.abs(x[i] % 2)` olmalıdır, çünkü `"x[i] % 2 == 1"`  
   tek başına negatif sayıları içermez. (negatif tek sayı için`x[i] % 2` -1 değerini verir.).

   (b) Tek bir negatif sayı olduğunda yöntem başarısız olur.

   (c) Bakınız `oddOrPoss_failure`.

2. (a) Boş veya sıfır uzunluklu bir dizi kusuru yürütmez.

   (b) Bakınız `oddOrPoss_defectNotExecuted`.

3. (a) Yöntemin spesifikasyonuna göre doğru koşulun doğru olarak değerlendirilmesi gerektiğinden, `x[i] % 2 == 1`
   koşulu negatif bir sayı için yanlış olarak değerlendirildiğinde bir enfeksiyon meydana gelir.
   Dolayısıyla, *negatif ve tek olmayan* bir veya daha fazla öğeye sahip herhangi bir dizi, kusuru çalıştırır ancak 
   enfeksiyona neden olmaz.

   (b) Bakınız `oddOrPos_defectExecuted_noInfection`.

4. (a) Hayır, durum enfekte olur olmaz, sayım her zaman çıktıya yayılan yanlış değeri alır.   

   (b) Cevap mümkün değil. 

5. Bakınız [`DIFFixed.java`](../code/lib/src/main/java/bs450/DIFFixed.java).
