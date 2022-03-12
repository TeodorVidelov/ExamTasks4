import java.util.Scanner;
public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double neededLitersGasoline = Double.parseDouble(scanner.nextLine());
        String dayOfTheWeek = scanner.nextLine();

        double spendForGasoline = 2.10 * neededLitersGasoline;
        double priceForGuide = 100;
        double totalSum = spendForGasoline + priceForGuide;

        if ("Saturday".equals(dayOfTheWeek)){
            totalSum *= 0.90;
        }
        else if ("Sunday".equals(dayOfTheWeek)){
            totalSum *= 0.80;
        }
        if (budget >= totalSum){
            System.out.printf("Safari time! Money left: %.2f lv.",budget - totalSum);
        }
        else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",totalSum - budget);
        }
    }
}