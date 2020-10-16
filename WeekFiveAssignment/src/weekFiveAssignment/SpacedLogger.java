package weekFiveAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		
		log = addSpaces(log); 
		System.out.println(log);
	}

	
	@Override
	public void error(String error) {
		error = addSpaces(error); 
		System.out.println("ERROR: " + error);
	}

	
	private String addSpaces(String l) {
		String spacer = l; 
		StringBuilder spaceBuilder = new StringBuilder(); 
		for (char c: spacer.toCharArray()) {
			spaceBuilder.append(c).append(" ");
		}
		
		return spaceBuilder.toString(); 
	}
	
}
