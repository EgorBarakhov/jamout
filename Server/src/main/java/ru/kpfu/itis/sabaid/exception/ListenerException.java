package ru.kpfu.itis.sabaid.exception;

public class ListenerException extends ServerException {

    public ListenerException() {
    }

    public ListenerException(String message) {
        super(message);
    }

    public ListenerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListenerException(Throwable cause) {
        super(cause);
    }

    public ListenerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
