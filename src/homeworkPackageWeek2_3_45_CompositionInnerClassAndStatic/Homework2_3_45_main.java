package homeworkPackageWeek2_3_45_CompositionInnerClassAndStatic;

public class Homework2_3_45_main {
	
	// Notlar ProductValidator dosyasına örneklerle yazıldı.
	// DatabaseHelper'ı da incele.

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price =10;
		product.name= "Keyboard";
		manager.add(product);

	}

}
