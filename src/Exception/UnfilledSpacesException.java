package Exception;

public class UnfilledSpacesException extends Exception {

	public UnfilledSpacesException() {
		super("You must enter the information in all the following fields: Type of Document, Name and Surname.");
	}
}
