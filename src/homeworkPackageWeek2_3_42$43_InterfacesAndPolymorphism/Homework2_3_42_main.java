package homeworkPackageWeek2_3_42$43_InterfacesAndPolymorphism;

public class Homework2_3_42_main {

	public static void main(String[] args) {

		// Interface'ler de abstract'lar gibi newlenemez.
		// Interface, onu implemente eden class'ın referansını tutabilir. Örn;

		// ICustomerDal customerDal = new OracleCustomerDal();

		////////////////////////////////////////
		// Interfaces nerede kullanılır?
		// !! Operasyonu implemente edilmesi istenen durumlarda kullanılır.
		////////////////////////////////////////
		// Extends ve Implements farkı?
		// Bir class birden fazla interface'i implemente edebilir. Örn;
		// public class MySqlCustomerDal implements ICustomerDal, IDenemeImp şeklinde.
		// Kısaca: (Class bir tane extend, birden fazla implement kullabilir.)

		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();

	}
}
