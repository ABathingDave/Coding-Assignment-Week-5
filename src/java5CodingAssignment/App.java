package java5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");
		
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
	}

}
