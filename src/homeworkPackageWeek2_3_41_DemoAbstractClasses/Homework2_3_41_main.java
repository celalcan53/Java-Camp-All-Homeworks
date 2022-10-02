package homeworkPackageWeek2_3_41_DemoAbstractClasses;

public class Homework2_3_41_main {

	public static void main(String[] args) {

		// Abstract Örneği -> Müşterinin veritabanına kaydedilmesi.
		// Farklı veri tabanlarına uygun.

		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}
