package Classes;
public class InvalidNoException extends Exception{

	private static String msg;

	public InvalidNoException() {
		super(msg);
	}
}