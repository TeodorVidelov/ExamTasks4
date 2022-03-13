import java.util.Scanner;
public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String termOfContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String internet = scanner.nextLine();
        int countMonths = Integer.parseInt(scanner.nextLine());

        double taxForMonth = 0;
        double taxForInternet = 0;
        int durationOfContract = 0;

        switch (termOfContract){
            case "one":
                durationOfContract = 1;
                switch (typeOfContract){
                    case "Small":
                        taxForMonth = 9.98;
                        break;
                    case "Middle":
                        taxForMonth = 18.99;
                        break;
                    case "Large":
                        taxForMonth = 25.98;
                        break;
                    case "ExtraLarge":
                        taxForMonth = 35.99;
                        break;
                }
                break;
            case "two":
                durationOfContract = 2;
                switch (typeOfContract){
                    case "Small":
                        taxForMonth = 8.58;
                        break;
                    case "Middle":
                        taxForMonth = 17.09;
                        break;
                    case "Large":
                        taxForMonth = 23.59;
                        break;
                    case "ExtraLarge":
                        taxForMonth = 31.79;
                        break;
                }
                break;
        }
        if ("yes".equals(internet)){
            if (taxForMonth <= 10){
                taxForInternet = 5.50;
            }
            else if (taxForMonth > 10 && taxForMonth <= 30){
                taxForInternet = 4.35;
            }
            else if (taxForMonth > 30){
                taxForInternet = 3.85;
            }
        }
        double totalSum = (taxForInternet + taxForMonth) * countMonths;
        if (durationOfContract == 2) {
            totalSum *= 0.9625;
        }
        System.out.printf("%.2f lv.",totalSum);
    }
}