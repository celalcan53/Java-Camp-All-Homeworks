package homeworkPackageWeek2_3_39_Overriding;

public class homework2_3_39_main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(), new TarimKrediManager(),
				new OgrenciKrediManager() };

		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));

			// Java'da bir class'ın herhangi bir operasyonu biz aksini belirtmediğimiz
			// sürece overridable(Üzerine yazılabilir)'dır.
			// Kısaca bir classı inherite eden başka bir class onu ezebilir.
			///////////////////////////////////////////////////////////////////////////////////
			// Örneğin BaseKrediManger'da kullandığımız operasyonu (return tutar*1.18;),
			// OgrenciKrediManager'da farklı bir şekilde kullanarak (return tutar * 1.10;)
			// ezdik. İkisi de belirttiğimiz şekilde çalıştı.
			///////////////////////////////////////////////////////////////////////////////////
			// Ezilmesini(Override edilmesini) engellemek istiyorsak, final keywordu
			// kullanmalıyız. Örnek Kullanım;
			// public final double hesapla(double tutar) {
			// return tutar*1.18; }

		}

	}

}
