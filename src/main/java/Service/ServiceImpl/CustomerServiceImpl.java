package Service.ServiceImpl;

import DTOs.CustomerDTO;
import Model.Customer;
import Service.CustomerService;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {

    @Override
    //Abstract Factory design patter/Facade design pattern
    public void customerReceiptValidation() {
        //Factory design pattern
        Customer firstCustomer = getCustomer();
        firstCustomer.setName("Mr Bsh");
        firstCustomer.setProductDTOList(new ArrayList<>());
        CustomerDTO customerDTO = new CustomerDTO();
        ModelMapper modelMapper = new ModelMapper();
        customerDTO.setName(firstCustomer.getName());
        customerDTO = modelMapper.map(firstCustomer, CustomerDTO.class);
        System.out.println(customerDTO);

    }

    @Override
    public void customerDeliveryConfirmation() {

    }

    @Override
    public Customer getCustomer() {
        return new Customer();
    }
}
