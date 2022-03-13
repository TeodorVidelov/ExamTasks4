import java.util.Scanner;
public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int countProducts = 0;
        double sum = 0;
        boolean isEnough = false;

        while (!"Stop".equals(input)){
            String typeProduct = input;
            double priceOfProduct = Double.parseDouble(scanner.nextLine());
            countProducts++;

            if (countProducts % 3 == 0){
                priceOfProduct *= 0.50;
            }
            if (budget < priceOfProduct){
                isEnough = true;
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!",Math.abs(budget - priceOfProduct));
                break;
            }
            budget -= priceOfProduct;
            sum += priceOfProduct;

            input = scanner.nextLine();
        }
        if (!isEnough){
            System.out.printf("You bought %d products for %.2f leva.",countProducts,sum);
        }
    }
}