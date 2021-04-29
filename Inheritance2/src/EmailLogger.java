
public class EmailLogger extends Logger{
	@Override 		// Bunu yazmasakta log'u override eder ama yazarsak biz anlarýz.
	public void log() {
		System.out.println("Email loglandý");
	}
}
