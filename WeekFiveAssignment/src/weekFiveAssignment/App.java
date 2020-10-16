package weekFiveAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger oneLogger = new AsterickLogger(); 
		oneLogger.log("Astericks"); 
		oneLogger.error("Astericks");
		
		System.out.println(" ");
		
		Logger twoLogger = new SpacedLogger(); 
		twoLogger.log("Spaces");
		twoLogger.error("More Spaces");
	}

}
