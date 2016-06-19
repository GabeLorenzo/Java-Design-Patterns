/** An exception that is thrown when no car with the specified VIN is in 
    inventory. */

public class NoSuchCarException extends Exception {
	
	private static NoSuchCarException nsce = new NoSuchCarException();

    /** initialize and return a new exception with no message */
    private NoSuchCarException() {

    }

    /** initialize and return a new exception with the indicated message */
    private NoSuchCarException(String msg) {
        super(msg);
    }

	public static NoSuchCarException instance(String error) {
		return nsce;
	}

}
