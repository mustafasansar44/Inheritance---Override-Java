
public class EmailLogger extends Logger{
	@Override 		// Bunu yazmasakta log'u override eder ama yazarsak biz anlar�z.
	public void log() {
		System.out.println("Email logland�");
	}
}
