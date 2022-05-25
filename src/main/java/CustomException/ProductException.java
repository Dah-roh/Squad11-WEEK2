package CustomException;

public class ProductException extends Exception {
    public String message;

    public ProductException(String message) {
        super(message);
    }
}
