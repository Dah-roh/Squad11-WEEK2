package CustomException;

public class CustomerException extends Exception{
    public String message;

    public CustomerException(String message) {
        super(message);
    }
}
