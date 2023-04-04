package guru.springfamework.services;

public class ResourceNotFoundException extends RuntimeException {

    ResourceNotFoundException() {
    }

    ResourceNotFoundException(String message) {
        super(message);
    }

    ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    ResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    ResourceNotFoundException(String message, Throwable cause, boolean enableSupresssion, boolean writableStackTrace) {
        super(message, cause, enableSupresssion, writableStackTrace);
    }
}
