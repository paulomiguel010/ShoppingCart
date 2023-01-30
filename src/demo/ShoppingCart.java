package demo;

import java.util.ArrayList;

public class ShoppingCart {

    private final ArrayList<Item> items;
    private double totalAmount;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalAmount = 0;

    }

    public void addToBasket(Item item){
       this.items.add(item);
    }

    public void showBasket() {
        System.out.println("===============================================");
        int count = 1;
        System.out.println("\tShopping Receipt");

        for (Item item : this.items) {
            if (item.getProductName().equals("Fruit tea") && item.getQuantity() == 1) {
                int quantity = item.getQuantity() + 1;
                item.setQuantity(quantity);
            }
            System.out.println(count + "." + item.getProductCode() + " " + item.getProductName() + "(" + item.getQuantity() + ") " + "x" + " £" + item.getPrice());
            count++;

        }
    }


    public void TotalAmount(){
        for (Item item : this.items) {
            if (item.getProductName().equals("Strawberries") && item.getQuantity() >= 3) {
                item.setPrince(4.50);
            } else if (item.getProductName().equals("Fruit tea") && item.getQuantity() == 2) {
                item.setQuantity(1);
            }
            this.totalAmount = this.totalAmount + item.getPrice() * item.getQuantity();

        }
        System.out.println("Total amount: "+"£"+this.totalAmount);
        System.out.println("===============================================");

    }

}
