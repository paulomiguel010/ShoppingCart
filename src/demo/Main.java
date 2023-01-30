package demo;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("FR1", "Fruit tea", 3.11,3);
        Item item2 = new Item("SR1", "Strawberries", 5.00,2);
        Item item3 = new Item("CF1", "Coffee", 11.23,1);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToBasket(item);
        shoppingCart.addToBasket(item2);
        shoppingCart.addToBasket(item3);
        shoppingCart.showBasket();
        shoppingCart.TotalAmount();

    }
}
