package by.litelife.flowers.exceptions;

/**
 * Created by Иван on 13.08.2016.
 */
public class AccessoryException extends Exception{
    public AccessoryException() {
    }

    public AccessoryException(String message) {
        super(message);
    }

    public AccessoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessoryException(Throwable cause) {
        super(cause);
    }

    public AccessoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
