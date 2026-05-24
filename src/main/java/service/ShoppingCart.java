package service;
import model.Food;
import model.Apple;

public class ShoppingCart {
    private Food[] groceryBasket;

    public ShoppingCart(Food[] groceryBasket) {
        this.groceryBasket = groceryBasket;
    }
    public double getTotalPriceNotDiscount() {
        double total = 0;
        for (Food food : groceryBasket) {
            total = total + (food.getTotalPrice());
        }
        return total;
    }

    public double getTotalPriceDiscount() {
        double total = 0;
        for (Food food : groceryBasket) {
            if (food instanceof Apple) {
                total = total + (food.getTotalPrice() * ((100 - ((Apple) food).getAppleDiscount()) / 100));
            } else total = total + (food.getTotalPrice());
        }

        return total;
    }

    public double getVegetarianTotalNotDiscount() {
        double total = 0;
        for (Food food : groceryBasket) {
            if (food.isVegetarian()) {
                total += food.getTotalPrice();
            }
        }
        return total;
    }
}