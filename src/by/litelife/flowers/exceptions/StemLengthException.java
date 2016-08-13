package by.litelife.flowers.exceptions;

/**
 * Created by Иван on 13.08.2016.
 */
public class StemLengthException extends Exception {
    public StemLengthException() {
    }

    public StemLengthException(String message) {
        super(message);
    }

    public StemLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public StemLengthException(Throwable cause) {
        super(cause);
    }

    public StemLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
