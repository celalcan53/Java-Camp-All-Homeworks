package homeworkPackageWeek2_3_38_Polymorphism;

public class Homework2_3_38_main {

	public static void main(String[] args) {
//	BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
//	for(BaseLogger logger:loggers) {
//		logger.Log("Log Mesajı");
//	}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
