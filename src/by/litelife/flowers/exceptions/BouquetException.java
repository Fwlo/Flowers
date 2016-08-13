package by.litelife.flowers.exceptions;

/**
 * Created by Иван on 13.08.2016.
 */
public class BouquetException extends Exception{
    public BouquetException() {
    }

    public BouquetException(String message) {
        super(message);
    }

    public BouquetException(String message, Throwable cause) {
        super(message, cause);
    }

    public BouquetException(Throwable cause) {
        super(cause);
    }

    public BouquetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
