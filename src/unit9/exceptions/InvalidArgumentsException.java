package unit9.exceptions;

public class InvalidArgumentsException extends RuntimeException { // Runtime is unchecked exception, so we don't need to throw the exception inside each method.
    // But it was a checked exception - then we would need to throw the exception in the methods.
    public InvalidArgumentsException(String message) {
        super(message);
    }
}
