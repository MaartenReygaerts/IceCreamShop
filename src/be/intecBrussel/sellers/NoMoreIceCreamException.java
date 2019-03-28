package be.intecBrussel.sellers;

/*
 * @author Maarten Reygaerts
 * @version 11
 * */
public class NoMoreIceCreamException extends Exception {
    public NoMoreIceCreamException() {
        super();
    }

    public NoMoreIceCreamException(String message) {
        super(message);
    }

    public NoMoreIceCreamException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoreIceCreamException(Throwable cause) {
        super(cause);
    }
}
