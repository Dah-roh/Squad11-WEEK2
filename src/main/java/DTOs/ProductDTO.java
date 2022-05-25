package DTOs;

import Model.Product;
import Model.VAT;


//Data Transfer Object
public class ProductDTO {
    private String name;
    private Double price;
    private int purchaseQuantity;
    private VAT    vat;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", purchaseQuantity=" + purchaseQuantity +
                ", vat=" + vat +
                '}';
    }

    public ProductDTO(Product product, VAT vat, int purchaseQuantity) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.purchaseQuantity = purchaseQuantity;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public VAT getVat() {
        return vat;
    }

    public void setVat(VAT vat) {
        this.vat = vat;
    }
}
