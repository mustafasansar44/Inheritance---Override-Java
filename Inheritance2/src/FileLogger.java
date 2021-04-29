
public class FileLogger extends Logger{
	@Override 		// Bunu yazmasakta log'u override eder ama yazarsak biz anlarýz.
	public void log() {
		System.out.println("Dosya loglandý");
	}
}
