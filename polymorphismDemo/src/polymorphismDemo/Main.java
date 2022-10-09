package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//EmailLogger emailLogger=new EmailLogger();
		//emailLogger.Log("Log mesajý");
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
