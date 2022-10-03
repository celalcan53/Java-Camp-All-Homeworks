package homeworkPackageWeek2_3_45_CompositionInnerClassAndStatic;

// ProductValidator, bir ürünü kaydederken veya güncellerken, kurallara uygun olup olmadığını bulmak için kullanılır.
public class ProductValidator { // Ana class. Statik olamaz.
	
	
	public static class baskaClass{
		// Bu şekilde bir class'ın içerisinded farklı bir class oluşturabiliriz.
		// Bu duruma inner class denir. Buna statik verebiliriz.
		public static void ekle() {}
	}

	public ProductValidator() { // Buna constructor denir.Class ismiyle aynıdır.
		// Yapıcı blok. New'leyince çalışır.
		System.out.println("Yapıcı Blok Çalıştı!");

	}

	static {
		// Birden fazla static blok oluşturulabilir fakat yaygın bir kullanım değil.
		// New'lemesek de çalışır.
		System.out.println("Statik Yapıcı Blok Çalıştı!");
	}

	// Bir metodu static yaptığımızda class ismiyle direkt çağrılır.

	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
