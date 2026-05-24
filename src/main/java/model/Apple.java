package model;
import model.constants.Colour;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    public String color;
    private double appleDiscount;
    public Apple(int amount, double price, String color){
        super(amount, price);
        this.color = color;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() { return Colour.RED.equals(color) ? DISCOUNT : 0.0; }

    public double getAppleDiscount(){
        appleDiscount = getDiscount();
        return appleDiscount;
    }





}
