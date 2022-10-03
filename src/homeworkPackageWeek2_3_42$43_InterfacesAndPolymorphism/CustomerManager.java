package homeworkPackageWeek2_3_42$43_InterfacesAndPolymorphism;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal= customerDal;
	}
	public void add() {
		// İş kodları buraya yazılır.
		customerDal.add();
		
	}

}
