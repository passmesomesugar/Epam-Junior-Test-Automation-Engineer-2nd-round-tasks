package exceptions;

public class StudentHasNoSubjectsException extends RuntimeException {
    public StudentHasNoSubjectsException() {
    }

    public StudentHasNoSubjectsException(String message) {
        super(message);
    }

    public StudentHasNoSubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentHasNoSubjectsException(Throwable cause) {
        super(cause);
    }
}