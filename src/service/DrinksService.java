package service;

import helper.enumHelper.DrinksMachine;

public class DrinksService {
    private double totalPrice;
    private int totalCount;
    private final DrinksMachine[] drinks = DrinksMachine.values();

    public void DrinksMachineMenu(){
        System.out.println("Select number or type drink name to order drink: ");
        for (DrinksMachine drink:
        drinks){
            System.out.printf("\t%d. Drink %s price = %.2f\n", drink.ordinal() + 1, drink.name(), drink.getPrice());
        }
        System.out.println("\t0. EXIT\n");
    }
    public void drinksOrder(String choice){
        switch (choice){
            case "1":
            case "COFFEE":
                totalPrice += DrinksMachine.COFFEE.getPrice();
                totalCount++;
                prepareDrink(DrinksMachine.COFFEE);
                DrinksMachine.COFFEE.setCount(DrinksMachine.COFFEE.getCount() + 1);
                break;
            case "2":
            case "TEA":
                totalPrice += DrinksMachine.TEA.getPrice();
                totalCount++;
                prepareDrink(DrinksMachine.TEA);
                DrinksMachine.TEA.setCount(DrinksMachine.TEA.getCount() + 1);
                break;
            case "3":
            case "LEMONADE":
                totalPrice += DrinksMachine.LEMONADE.getPrice();
                totalCount++;
                prepareDrink(DrinksMachine.LEMONADE);
                DrinksMachine.LEMONADE.setCount(DrinksMachine.LEMONADE.getCount() + 1);
                break;
            case "4":
            case "MOJITO":
                totalPrice += DrinksMachine.MOJITO.getPrice();
                totalCount++;
                prepareDrink(DrinksMachine.MOJITO);
                DrinksMachine.MOJITO.setCount(DrinksMachine.MOJITO.getCount() + 1);
                break;
            case "5":
            case "SODA":
                totalPrice += DrinksMachine.SODA.getPrice();
                totalCount++;
                prepareDrink(DrinksMachine.SODA);
                DrinksMachine.SODA.setCount(DrinksMachine.SODA.getCount() + 1);
                break;
            case "6":
            case "COLA":
                totalPrice += DrinksMachine.COLA.getPrice();
                totalCount++;
                prepareDrink(DrinksMachine.COLA);
                DrinksMachine.COLA.setCount(DrinksMachine.COLA.getCount() + 1);
                break;
            default:
                System.out.println("Invalid input, please try again\n");
        }
    }
    public void prepareDrink(DrinksMachine drink){
        System.out.println("Preparing drink " + drink);
    }
    public void printDrinksOrder(){
        System.out.printf("Total drinks ordered = %d with total price = %.2f dollars", totalCount, totalPrice);
    }
    public void printSelectedDrinks(){
        for (DrinksMachine drink:
        drinks){
            if (drink.getCount() > 0){
                System.out.printf("Drink %s was ordered %d x times\n", drink.name(), drink.getCount());
            }
        }
    }
}
