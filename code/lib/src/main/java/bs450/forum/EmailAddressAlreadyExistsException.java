package bs450.forum;

public class EmailAddressAlreadyExistsException extends RuntimeException {

    public EmailAddressAlreadyExistsException(String message) {
        super(message);
    }
}
