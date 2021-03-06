public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk!";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.trim().length() == 0){
			response = "Please say something!";
		}else if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else {
			response = getRandomResponse();
		}
		if(statement.indexOf("Mr.") >= 0){
			response = "He sounds like a good teacher.";
		}else if(statement.indexOf("Ms.") >= 0){
			response = "She sounds like a good teacher.";
		}
		if (statement.indexOf("hello") >= 0){
			response = "Hello, how are you?";
		}else if(statement.indexOf("goodmorning") >= 0){
			response = "It's too early...I'm tired";
		}else if(statement.indexOf("good afternoon") >= 0){
			response = "Time to take a nap!";	
		}else if(statement.indexOf("goodnight") >= 0){
			response = "Goodnight, talk to you tomorrow!";
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "That's interesting!";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "Naww.";
		} else if (whichResponse == 4){
			response = "What else is new?";
		} else if (whichResponse == 5){
			response = "Okaay...";
		}
		return response;
	}
}
