package model;
import model.constants.Colour;


import static model.constants.Discount.DISCOUNT;


public class Apple extends Food implements Discountable {
    public String color;
    private double appleDiscount;
    public Apple(int amount, double price, String color){
        super(amount, price);
        this.color = color;
        this.isVegetarian = true;


    }

    @Override
    public double getDiscount() {
        if (Colour.RED == color) {
            appleDiscount = DISCOUNT;
        } else appleDiscount = 0.0;
        return 0.0;
    }

    public double getAppleDiscount(){
        getDiscount();
        return appleDiscount;
    }





}
