import CustomException.CustomerException;
import CustomException.ProductException;
import Service.ServiceImpl.CustomerServiceImpl;
import Service.ServiceImpl.ProductServiceImpl;

public class Main extends ProductServiceImpl {
    public static void main(String[] args) throws ProductException, CustomerException {
        Main main = new Main();
//        System.out.println(main.inventory("Bournvita", 0, 0.0));
        CustomerServiceImpl customerService =  new CustomerServiceImpl();
        customerService.customerReceiptValidation();
    }
}
