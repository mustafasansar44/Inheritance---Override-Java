
public class FileLogger extends Logger{
	@Override 		// Bunu yazmasakta log'u override eder
	public void log() {
		System.out.println("Dosya loglandı");
	}
}
