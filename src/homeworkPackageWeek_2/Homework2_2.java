package homeworkPackageWeek_2;

public class Homework2_2 {

	public static void main(String[] args) {

		// Ödev videolarının içeriği;
		// 24- Metodları Anlamak || Sözel bir anlatım, izlenmesi gerek.
		// 25- Parametreli Metodları Anlamak || Sözel bir anlatım, izlenmesi gerek.
		// 26- Variable Arguments ile Çalışmak || Sözel bir anlatım, izlenmesi gerek.
		// 27- Class Nedir? - Doğru Anlamak || Sözel bir anlatım, izlenmesi gerek.
		// 28- Bir Class Nasıl Çalışır?

		////// Not-1; ( Classlı başka bir class içerisinde nasıl kullanırız?

		System.out.println("----------------- Ders 28 - Not 1 -----------------");

		CustomerManager customerManager = new CustomerManager();
		// Diğer Class olan CustomerManager içindeki fonksiyonları bu şekilde kullandık.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		////// Not-2: Class'lar referans tiptir. (Reference Type)
		////// Not-3: İsimlendirirken kısaltma kullanma.

		// 29- Değer (Value) ve Referans (Reference) Tipleri (Çok Önemli)
		////// Not-1: Value Type'ta değişkenler Stack içerisinde toplanır.
		////// Not-2: Reference Type'ta ise değişkenin ismi Stack bölümünde, o
		////// değişkenin karşılığı ise(Eşitliğin arından gelen değer) Heap bölümünde
		// saklanır. Yani ortak operasyonları tutar.
		////// Not-3: Diziler(Arrays) referans tiptir(Reference Type).

		// Value ve Reference Type'a örnekler;

		// Value Type Örneği;

		System.out.println("----------------- Ders 29 - Not 1 -----------------");

		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);

		// Reference Type Örneği;

		System.out.println("----------------- Ders 29 - Not 2 -----------------");

		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers1 = numbers2;
		numbers1[0] = 11;
		System.out.println(numbers2[0]);

		// 30- ReCap Demo - Classlarla Çalışmak

		System.out.println("--------------------- Ders 30 ---------------------");

		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 10);
		int sonuc2 = dortIslem.Cikar(20, 12);
		int sonuc3 = dortIslem.Carp(3, 11);
		int sonuc4 = dortIslem.Bol(56, 8);

		System.out.println(sonuc);
		System.out.println(sonuc2);
		System.out.println(sonuc3);
		System.out.println(sonuc4);

		// 31- Field ve Attribute ile Çalışmak

		////// Not-1: Her Class, tek bir iş yapmalı. (Örneğin Product ve Product Manager
		////// işi tek class içerisinde yapılmamalı. Product ve Product Manager olarak
		////// ayrı classlar oluşturulmalı.)

		System.out.println("--------------------- Ders 31 ---------------------");

		Product product = new Product();
		product.set_name("Telefon");
		product.set_id(26);
		product.set_description("Huawei Telefon");
		product.set_price(3640);
		product.set_stockAmount(4);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		// 32- Encapsulation İhtiyacını Anlamak || Sözel bir anlatım, izlenmesi gerek.
		// 33- Getter ve Setter ile Çalışmak

		////// Not-1: Getter -> Bir değeri okumaya yönelik işlem.
		////// Not-2: Setter -> Bir değeri yazmaya yönelik işlem.

		// Getter ve Setter örneği Product.java dosyasında.

		// 34- Constructor ile Çalışmak

		////// Not-1: Parametreli Constructor

		// Product product = new Product (id:1, name:Laptop, description: Gamer Laptop,
		// price: 5400);

		// ** Parametreli constructor'da yazılan değerler verilmek zorundadır. Sadece bu
		// değerler eksiksiz verildiğinde çalışacaktır.

		////// Not-2: Overloading

		// public Product (int id, String name, String description, double Price) {
		// this.id = id
		// this.name = name
		// this.description = description
		// this.price = price

		// 35- Method Overloading ile Çalışmak

		////// Not-1: Method Overloading nedir? Örneğin, bizim hazırda iki farklı sayı
		////// üzerinde hesap yapabilmesi için yazılmış kodumuz var. Biz istiyoruz ki
		////// artık üç sayıyla da işlem yapabilelim fakat önceki işlemler herhangi bir
		////// zarar görmesin. Buradaki mantıkta dikkat edilmesi gereken nokta, eski
		////// fonksiyonda bir değişiklilik yapılmaması, sadece yeni bir özellik daha
		////// eklenmesidir. Bizim mevcut kodumuzu aşağıdaki gibidir;

		// public int Topla(int sayi1, int sayi2) {
		// return sayi1+sayi2;
		// }

		////// Biz, bunun üç sayıyla işlem yapabilmesi için şu şekilde bir ekleme
		////// yapabiliriz;

		// public int Topla(int sayi1, int sayi2, int sayi3) {
		// return sayi1+sayi2;
		// }

		////// Görüldüğü üzere sadece sayi3'ü ekledik. Peki iki değişkenin de ismi
		////// "Topla", bu bir çakışma yaratır mı? Hayır yaratmaz. İsteyen iki tane sayı
		////// yazacaktır, o zaman iki sayılı değişken çalışır. İsteyen üç tane sayıyla
		////// işlem yapacaktır, o zaman da yeni yazdığımız değişken çalışacaktır.
		////// Birbirleriyle çakışmazlar. Bu şekilde eski kullanımlara da zarar gelmez.
		////// Bu işleme Method Overloading denir.

		// 36- Inheritance (Miras) yapısını anlamak. (Önemli)

		Customer customer = new Customer();
		Employee employee = new Employee();

		////// Not-1: Yukarıdaki kodlara baktığımızda, örneğin bir müşteri ve
		////// çalışanları içeren sistem yapıyoruz. İki farklı classta da kullanacağımız
		////// aynı şeyler vardır, bunlar id, isim, soyisim, yaş, eposta, telefon
		////// bilgisi olabilir. Bunları iki classta da ayrı ayrı tanımlamak yerine,
		////// ortak olan özellikleri tek bir classta tanımlıyoruz ve diğer classlarda,
		////// bu ortak classı extend veriyoruz. Yani inherit(miras) veriyoruz. Bu
		////// durumda kodları kullanırken, hem ortak değişkenler hem de o classa özel
		////// değişkenler önümüze çıkıyor. Bahsettiğim örnek Employee, Customer ve
		////// Person Class'ında uygulanmıştır. Person bu durumda ortak özellikleri
		////// taşır. Aşağıda Employee classını kullandığımızda hem personda bulunan
		////// değişkenler, hem de employee'de bulunan salary özelliği gelecektir.

		// 37- Inheritance (Miras) Demo. (Önemli) || Sözel bir anlatım, kesinlikle
		// izlenmesi gerek.

		////// Not-1: Bu işlem Polymorphism kavramıyla adlandırılır, yani çok
		////// biçimlilik. Polymorphism, kavramı nesneye yönelik programlamanın temel
		////// taşlarından birisidir. Tanım olarak, bir nesnenin birbirinden farklı
		////// nesneler şeklinde davranmasını sağlamamıza olanak veren yapı diyebiliriz.

	}

}
