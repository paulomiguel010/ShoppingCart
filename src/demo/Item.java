package demo;

public class Item {
    private final String productCode;
    private final  String productName;
    private  double price;

    private  int quantity;



    public Item(String productCode, String productName, double price, int quantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int i){
        this.quantity = i;
    }

    public void setPrince(double price){
        this.price = price;
    }



}
