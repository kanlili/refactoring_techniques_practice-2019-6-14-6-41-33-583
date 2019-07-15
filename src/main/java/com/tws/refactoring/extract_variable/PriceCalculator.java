package com.tws.refactoring.extract_variable;

public class PriceCalculator {
     public double getPrice(int quantity, int itemPrice) {
        return printBasePrice(quantity,itemPrice) -
                printDiscount(quantity,itemPrice) +
                printShippingCost(quantity,itemPrice);
    }
    public double printBasePrice(int quantity, int itemPrice){
         return quantity * itemPrice;
    }
    public  double  printDiscount(int quantity, int itemPrice){
         return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }
    public  double  printShippingCost(int quantity, int itemPrice){
        return Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
