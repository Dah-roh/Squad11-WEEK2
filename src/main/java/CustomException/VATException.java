package CustomException;

public class VATException extends Exception{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public VATException(String message) {
        super(message);
    }
}
