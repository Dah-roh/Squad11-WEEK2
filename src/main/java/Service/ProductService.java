package Service;

import CustomException.CustomerException;
import CustomException.ProductException;
import Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> inventory(String name,
                            int quantity,
                            Double price)throws ProductException, CustomerException;
}
