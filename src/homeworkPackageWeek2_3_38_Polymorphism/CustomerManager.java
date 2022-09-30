package homeworkPackageWeek2_3_38_Polymorphism;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
public void add(){
	System.out.println("Müşteri Eklendi");
	this.logger.log("log mesajı");
}
}
