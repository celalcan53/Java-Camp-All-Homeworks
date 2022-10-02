package homeworkPackageWeek2_3_40_AbstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla(); // Inherite eden her classta override yapılması gerek. (abstract)

	public final void gameOver() { // Inherite eden diğer classlarda aynı kalır, override edilemez. (final)
		System.out.println("Oyun Bitti!");
	}

}
