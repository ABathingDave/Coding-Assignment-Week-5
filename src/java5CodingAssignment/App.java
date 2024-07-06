package java5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLogger = new AsteriskLogger(); //#6a Here are the instances of each of the logger classes.
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello"); //#6b Here are the methods being tested.
		asteriskLogger.error("Hello");
		
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
	}

}
