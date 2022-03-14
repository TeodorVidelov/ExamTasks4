import java.util.Scanner;
public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumber = Integer.parseInt(scanner.nextLine());

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for (int i = 0; i < countNumber; i++) {
            int number = Integer.parseInt(scanner.nextLine());

             if (number % 2 == 0){
                n1++;
            }
             if (number % 3 == 0){
                n2++;
            }
             if (number % 4 == 0){
                n3++;
            }
        }
        System.out.printf("%.2f%%\n",(n1 * 1.0 / countNumber) * 100);
        System.out.printf("%.2f%%\n",(n2 * 1.0 / countNumber) * 100);
        System.out.printf("%.2f%%\n",(n3 * 1.0 / countNumber) * 100);
    }
}