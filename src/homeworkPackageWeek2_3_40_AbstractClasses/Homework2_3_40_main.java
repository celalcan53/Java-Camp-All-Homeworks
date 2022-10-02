package homeworkPackageWeek2_3_40_AbstractClasses;

public class Homework2_3_40_main {

	public static void main(String[] args) {

		// Abstract nedir?
		//////////////////////////////////////////
		// Eğer operasyonları ana dosyada değil de her dosyaların kendi operasyonunu
		// belirlemesini istiyorsak abstract kullanırız.
		//////////////////////////////////////////
		// Daha anlaşılır ifade etmek gerekirse, abstract yazılan operasyonun inherite
		// edilen diğer classlarda yazılmasını zorunlu kılar. Bu sayede her dosyada
		// operasyon override edilir.
		//////////////////////////////////////////
		// Örnekte görüldüğü üzere ana dosya olan GameCalculator dosyasında hesapla
		// operasyonunu abstract class olarak belirledik, bu yüzden GameCalculator'u
		// inherite eden bütün classlar hesapla operasyonunu override (üzerine yazmak /
		// tekrar yazmak) etmek zorunda.
		/////////////// KURALLAR///////////////////
		// 1- Bir classın abstract olabilmesi için abstract imzasıyla beslenmesi
		// gerekir. Örneğin: public class değil, public abstract class şeklinde.
		// 2- Operasyonun abstract olabilmesi için aynı şekilde abstract imzası gerek.
		// 3-Abstract class içinde abstract operasyon olmak zorunda değildir.
		// 4-Abstract class asla newlenemez. (Örn: new GameCalculator)

		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();

	}

}
