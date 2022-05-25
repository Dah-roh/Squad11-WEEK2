package Service.ServiceImpl;

import CustomException.CustomerException;
import CustomException.ProductException;
import Model.Product;
import Service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    public List<Product> inventoryTaken;

    @Override
    public List<Product> inventory(String name, int quantity, Double price)
            throws ProductException, CustomerException {
        Product beverage = new Product();
        beverage.setName(name);
        beverage.setStockQuantity(quantity);
        beverage.setPrice(price);
        if(beverage.getStockQuantity()<=0){
            throw new ProductException("Cannot take inventory for product with quantity 'ZERO' : " +
                     beverage.getStockQuantity());

        }
        inventoryTaken.add(beverage);
        return inventoryTaken;
    }
}
