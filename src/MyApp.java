import service.DrinksService;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinksService service = new DrinksService();
        while (true){
            service.DrinksMachineMenu();
            String choice = scanner.nextLine().trim().toUpperCase();
            if(choice.equals("EXIT") || choice.equals("0")){
                break;
            }
            service.drinksOrder(choice);
        }
        service.printSelectedDrinks();
        service.printDrinksOrder();
    }
}
