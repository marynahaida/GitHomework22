package helper.enumHelper;

import helper.constants.Drinks;

public enum DrinksMachine {
    COFFEE(Drinks.COFFEE_PRICE, 0),
    TEA(Drinks.TEA_PRICE, 0),
    LEMONADE(Drinks.LEMONADE_PRICE, 0),
    MOJITO(Drinks.MOJITO_PRICE, 0),
    SODA(Drinks.SODA_PRICE, 0),
    COLA(Drinks.COLA_PRICE, 0);
    private final double price;
    private int count;

    DrinksMachine(double price, int count) {
        this.price = price;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
