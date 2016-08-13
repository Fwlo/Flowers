package by.litelife.flowers.exceptions;

/**
 * Created by Иван on 13.08.2016.
 */
public class FreshnessException extends Exception {
    public FreshnessException() {
    }

    public FreshnessException(String message) {
        super(message);
    }

    public FreshnessException(String message, Throwable cause) {
        super(message, cause);
    }

    public FreshnessException(Throwable cause) {
        super(cause);
    }

    public FreshnessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
