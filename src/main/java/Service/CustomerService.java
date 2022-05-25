package Service;

import Model.Customer;

public interface CustomerService {
    void customerReceiptValidation();
    void customerDeliveryConfirmation();
    Customer getCustomer();

}
