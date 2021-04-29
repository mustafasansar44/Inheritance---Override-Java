
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger());	// İstediğimiz loglama tekniğini burada belirtmemiz yetecektir.

	}

}
