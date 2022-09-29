package homeworkPackageWeek1_2;

public class Homework1_2 {

	public static void main(String[] args) {

		// Java Dersi 5 (Hello World)
		System.out.println("Hello everyone, its Java!");

		System.out.println("--------------------");

		// Java Dersi 6 (Değişkenler)

		int basariliDersler = 10;
		int basarisizDersler = 2;
		String dersBilgi = "Başarılı ders sayısı:";
		String dersBilgi2 = "Başarısız ders sayısı:";
		System.out.println(dersBilgi + basariliDersler);
		System.out.println(dersBilgi2 + basarisizDersler);

		// Java Dersi 7 (Temel Veri Tipleri)

		// byte deneme = 5; // -128 - 127
		// short deneme2 = 10; // -32768 - 32768
		// int deneme3 = 20; // -2milyar - 2milyar !! Tam sayılar için en çok
		// kullanılan.
		// long deneme4 = 30; // Bayağı büyük sayı aralığı
		// float deneme5 = 3.401f; // Küsüratlı Sayılar için (double sayılmaması için
		// sonuna "f" ekleriz.)
		// double deneme6 = 5.50; // Küsüratlı sayılar, daha geniş aralık. !! Ondalık
		// sayılar için en çok
		// kullanılan.
		// char deneme7 = 'C'; // Sadece bir karakteri temsil etmeli. Tek tırnak arası.
		// boolean deneme8 = true; // Doğru ya da yanlış. !! Genel olarak çok
		// kullanılan.

		System.out.println("--------------------");

		// Java Dersi 8 (Şart Blokları (Conditionals))

		int sınavNotu = 53;

		if (sınavNotu >= 50) {
			System.out.println("Tebrikler, dersi başarıyla geçtiniz. Notunuz:" + sınavNotu);
		} else if (sınavNotu < 50) {
			System.out.println("Maalesef dersi geçemediniz. Notunuz:" + sınavNotu);
		} else {
			System.out.println("Sınav bilginiz bulunamadı.");
		}

		System.out.println("--------------------");

		// Java Dersi 9 (Recap Demo 1, En büyük sayıyı bulmak)

		int sayi1 = 33;
		int sayi2 = 17;
		int sayi3 = 9;
		int sayi4 = 53;

		int buyukSayi = sayi1;

		if (buyukSayi < sayi2) {
			buyukSayi = sayi2;
		} else if (buyukSayi < sayi3) {
			buyukSayi = sayi3;
		} else if (buyukSayi < sayi4) {
			buyukSayi = sayi4;
		}

		System.out.println("En büyük sayı=" + buyukSayi);

		System.out.println("--------------------");

		// Java Dersi 10 (Switch Blokları)

		char skill = 'S';

		switch (skill) {
		case 'S':
			System.out.println("Oyunda en yüksek dereceye sahip oldunuz!");
			break;
		case 'A':
			System.out.println("Oyunda yüksek dereceye sahip oldunuz!");
			break;
		case 'B':
			System.out.println("Oyunda orta dereceye sahip oldunuz!");
			break;
		case 'G':
		case 'F':
			System.out.println("Oyunda kötü dereceye sahip oldunuz!");
			break;
		default:
			System.out.println("Oyun bilginiz bulunamadı!");
			break;
		}

		System.out.println("--------------------");

		// Java Dersi 11 (For Döngüsü)

		for (int i = 5; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("Döngü Tamamlandı!");

		System.out.println("--------------------");

		// Java Dersi 12 (While Döngüsü)

		int i = 1;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("While döngüsü tamamlandı!");

		System.out.println("--------------------");

		// Java Dersi 13 (Do-While Döngüsü)

		int c = 10;

		do {
			System.out.println(c);
			c++;
		} while (c < 5);
		System.out.println("Do-While döngüsü tamamlandı!"); // While döngüsünden farkı şudur; Şart sağlanırsa, normal
															// while gibi çalışır. Şart sağlanmaz ise while'dan farklı
															// olarak sadece bir kere çalışır. Mevcut örnekteki gibi.

		System.out.println("--------------------");

		// Java Dersi 14 (Arrays)

		String[] cars = new String[5];

		cars[0] = "Nissan";
		cars[1] = "Subaru";
		cars[2] = "Lotus Elise";
		cars[3] = "Mazda";
		cars[4] = "Toyota";

		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("--------------------");

		// Java Dersi 15 (Recap Demo 2 - Arrays)

		int[] numbers = { 53, 12, 6, 5, 9, 42, 13 };

		int total = 0;
		int bigNumber = numbers[0];

		for (int number : numbers) {
			total = total + number; // Toplamı hesaplamak.
			if (bigNumber < number) { // En büyük sayıyı göstermek.
				bigNumber = number;
			}
		}

		int ortalama = total / numbers.length; // Sayıların ortalamasını verir.

		System.out.println(total);
		System.out.println(bigNumber);
		System.out.println(ortalama);

		System.out.println("--------------------");

		// Java Dersi 16 (Çok boyutlu diziler)

		String[][] takimlar = new String[4][2];

		takimlar[0][0] = "Mavi-1";
		takimlar[0][1] = "Mavi-2";
		takimlar[1][0] = "Sarı-1";
		takimlar[1][1] = "Sarı-2";
		takimlar[2][0] = "Yeşil-1";
		takimlar[2][1] = "Yeşil-2";
		takimlar[3][0] = "Mor-1";
		takimlar[3][1] = "Mor-2";

		for (int b = 0; b <= 3; b++) {
			System.out.println("/////////////////////");
			for (int j = 0; j <= 1; j++) {
				System.out.println(takimlar[b][j]);
			}
		}

		System.out.println("--------------------");

		// Java Dersi 17 (Stringlerle Çalışmak)

		String message = "Çok sıcak bir gün.";
		System.out.println(message);
		System.out.println("Eleman Sayısı:" + message.length()); // String içindeki eleman sayısını verir.
		System.out.println("7.eleman:" + message.charAt(6)); // Değeri girilen indekste hangi eleman olduğunu verir.
		System.out.println(message.concat(" Umarım yarın böyle olmaz.")); // String'e ekleme yapmamızı sağlar.
		System.out.println(message.startsWith("Ç")); // String'in, yazılan değerle başlayıp başlamadığını sorgular.
		System.out.println(message.endsWith(".")); // String'in, yazılan değerle bitip bitmediğini sorgular.
		// ------------------------------------------
		char[] characters = new char[9];
		message.getChars(0, 9, characters, 0); // String'de değeri girilen karakterlerin alınmasını sağlar.
		System.out.println(characters);
		// ------------------------------------------
		System.out.println(message.indexOf("sıcak")); // String'de, girilen değerin kaçıncı indekste olduğunu verir.
		System.out.println(message.lastIndexOf("r")); // String'de, girilen değerin bulunduğu en son indeksi verir.

		System.out.println("--------------------");

		// Java Dersi 18 (Stringlerle Çalışmak 2)

		String message2 = "Keşke hava biraz daha soğuk olsa. :(";
		System.out.println(message2);

		System.out.println(message2.replace("soğuk", "sıcak")); // String'in içeriğini değiştirmeye yarar. Eski içerik
																// gider, yenisi eklenir.
		System.out.println(message2.substring(0, 6)); // Belirtilen indeks aralığındaki içeriği alır.
		System.out.println("/////////////////////");
		// ------------------------------------------
		for (String kelimeler : message2.split(" ")) { // Belirtilen değer ile karşılaşıldığında bir kademe aşağıya
														// kaydırır. Örneğin biz değer olarak boşlukları seçtik.
			System.out.println(kelimeler);
		}
		System.out.println("/////////////////////");
		// ------------------------------------------
		System.out.println(message2.toLowerCase()); // Küçük harfe çevirir.
		System.out.println(message2.toUpperCase()); // Büyük harfe çevirir.
		// ------------------------------------------
		String message3 = "   KIRMIZI ELMA   ";
		System.out.println(message3);
		System.out.println(message3.trim()); // String içeriğinin başındaki ve sonundaki boşlukları silmeye yarar.
		System.out.println("--------------------");

		// Java Dersi 19 (Mini Proje-1 / Sayı asal mı?)

		int number = 53;
		int remainder = number % 2;
		boolean isPrime = true;
		System.out.println(remainder);

		for (int x = 2; x < number; x++) {
			if (number % x == 0) {
				isPrime = false;
			}
		}

		if (number == 1) {
			System.out.println("Sayı asal değildir!");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz Sayı!");
			return;
		}

		if (isPrime) { // Sadece isPrime yazmak bu anlama gelir --> isPrime == true
			System.out.println("Sayı asaldır!");
		} else {
			System.out.println("Sayı asal değildir!");
		}

		System.out.println("--------------------");

		// Java Dersi 20 (Mini Proje-2 / Kalın ve İnce sesli harfler)

		char harf = 'I';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
		default:
			System.out.println("İnce Sesli Harf");
		}

		System.out.println("--------------------");

		// Java Dersi 21 (Mini Proje-3 / Mükemmel Sayılar)

		int number2 = 28;
		int total2 = 0;

		for (int y = 1; y < number2; y++) {
			if (number2 % y == 0) {
				total2 = total2 + y;
			}
		}

		if (total2 == number2) {
			System.out.println(number2 + " mükemmel sayıdır!");
		} else {
			System.out.println(number2 + " mükemmel sayı değildir!");
		}

		System.out.println("--------------------");

		// Java Dersi 22 (Mini Proje-4 / Arkadaş Sayılar)

		int number3 = 220;
		int number4 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (i = 1; i < number3; i++) {
			if (number3 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}

		for (i = 1; i < number4; i++) {
			if (number4 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		if (number3 == toplam2 && number4 == toplam1) {
			System.out.println("Bu iki sayı arkadaştır!");
		} else {
			System.out.println("Bu iki sayı arkadaş değildir!");
		}

		System.out.println("--------------------");

		// Java Dersi 23 (Mini Proje-5 / Sayı Bulma)

		int[] sayilar = new int[] { 3, 5, 9, 12, 53, 42, 66 };
		int aranacak = 66;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Sayı mevcuttur!");
		} else {
			System.out.println("Sayı mevcut değildir!");
		}

		////////////////////////////////////////////////////////
		System.out.println("----------SON----------");
		////////////////////////////////////////////////////////

	}

}
