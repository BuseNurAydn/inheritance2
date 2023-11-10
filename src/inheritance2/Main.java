package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager1 = new CustomerManager();
		customerManager1.add(new DatabaseLogger());
		customerManager1.add(new FileLogger());
		customerManager1.add(new EmailLogger());
		
		

	}

}
