package homeworkPackageWeek2_3_45_CompositionInnerClassAndStatic;

//inner class yapısı örneği

//Bu yapı önerilmez!
//SOLID'ın single responsibility prensibine aykırı olur. (Tek Class sadece bir iş yapar.)
// Inner class yerine iki ayrı class oluşturmak daha mantıklıdır.

public class DatabaseHelper {

	// inner class
	public static class Crud { // Create Read Update Delete -CRUD

		// İçleri boş. Örnek bir yapı olduğu için.
		public static void Delete() {

		}

		public static void Update() {

		}

		public static class Connection {
			public static void createConnection() {

			}
		}
	}
}
