package exceptions;

/**
 * Custom base exception for this program.
 * Custom exceptions are stored for easy access.
 */
public class SEPException extends Exception {
    public SEPException(String message) {
        super(message);
    }
}
