# Daha İyi Birim Testler

`code` klasöründeki, [`bs450.forum`](../code/lib/src/main/java/bs450/forum/) paketi kullanıcı ve postları içeren online bir
forum sayfasını temsil etmektedir. Bu paketin içinde üç sınıf bulunmaktadır:

–[`Forum`](../code/lib/src/main/java/bs450/forum/Forum.java),
[`User`](../code/lib/src/main/java/bs450/forum/User.java) ve
[`Post`](../code/lib/src/main/java/bs450/forum/Post.java)


[`ForumTest`](../code/lib/src/test/java/bs450/forum/ForumTest.java) sınıfı `Forum` sınıfının testini içermektedir. Ancak, ancak testlerde şu problemleri de
barındıran bazı sorunlar bulunmaktadır:

* Potansiyel kırılganlık
* Açıklık eksikliği
* Kısalık eksikliği
* Davranışa değil uygulamaya odaklanma.

## Ne yapmalısınız?

`ForumTest` sınıfındaki her bir testi alın. Derste öğrendiklerinize dayalı olarak şunları tespit edip düzeltin:

1. Neden sorun olduğunu/olabileceğini belirterek, olası sorunların her birini tanımlayın.

2. Belirlediğiniz sorunları ortadan kaldırmak için testi yeniden yazın.

3. Testini yukarıdaki kriterde (1) belirlediğiniz problemlere göre gözden geçiriniz. Tanımladığınız bütün
   problemleri çözdüğünüzden emin olun.
