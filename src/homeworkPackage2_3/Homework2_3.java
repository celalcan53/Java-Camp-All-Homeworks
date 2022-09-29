package homeworkPackage2_3;

public class Homework2_3 {

	public static void main(String[] args) {
//	BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
//	for(BaseLogger logger:loggers) {
//		logger.Log("Log Mesajı");
//	}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
