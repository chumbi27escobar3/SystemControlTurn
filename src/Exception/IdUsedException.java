package Exception;

public class IdUsedException extends Exception {

	public IdUsedException() {
		super("The document is already registered in our system");
	}
	
}
