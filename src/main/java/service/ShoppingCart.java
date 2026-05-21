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
        for (int i = 0; i < groceryBasket.length; i++) {
            total = total + (groceryBasket[i].getTotalPrice());
        }
        return total;
    }

    public double getTotalPriceDiscount() {
        double total = 0;
        for (int i = 0; i < groceryBasket.length; i++) {
            if (groceryBasket[i] instanceof Apple) {
                total = total + (groceryBasket[i].getTotalPrice() * ((100 - ((Apple) groceryBasket[i]).getAppleDiscount()) / 100));
            } else total = total + (groceryBasket[i].getTotalPrice());


        }
        return total;
    }

    public double getVegetarianTotalNotDiscount() {
        double total = 0;
        for (int i = 0; i < groceryBasket.length; i++) {
            if (groceryBasket[i].isVegetarian()) {
                total = total + (groceryBasket[i].getTotalPrice());
            }
        }
        return total;
    }
}