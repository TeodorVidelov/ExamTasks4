import java.util.Scanner;
public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int countHours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        double price = 0;

        for (int days = 1; days <= countDays; days++) {
            double sumForADay = 0;
            for (int hours = 1; hours <= countHours; hours++) {

                if (days % 2 == 0 && hours % 2 != 0){
                    price = 2.50;
                }
                else if (days % 2 != 0 && hours % 2 == 0){
                    price = 1.25;
                }
                else {
                    price = 1;
                }
                sumForADay += price;
            }
            totalSum += sumForADay;
            System.out.printf("Day: %d - %.2f leva\n",days,sumForADay);
        }
        System.out.printf("Total: %.2f leva",totalSum);
    }
}