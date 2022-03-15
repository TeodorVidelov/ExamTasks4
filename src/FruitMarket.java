import java.util.Scanner;
public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfStrawberry = Double.parseDouble(scanner.nextLine());
        double kgBananas = Double.parseDouble(scanner.nextLine());
        double kgOranges = Double.parseDouble(scanner.nextLine());
        double kgRaspberry = Double.parseDouble(scanner.nextLine());
        double kgStrawberry = Double.parseDouble(scanner.nextLine());

        double priceOfRaspberry = priceOfStrawberry * 0.50;
        double priceOranges = priceOfRaspberry * 0.60;
        double priceBananas = priceOfRaspberry * 0.20;

        double totalSum = kgRaspberry * priceOfRaspberry + kgBananas * priceBananas +
                kgOranges * priceOranges + kgStrawberry * priceOfStrawberry;

        System.out.printf("%.2f",totalSum);
    }
}