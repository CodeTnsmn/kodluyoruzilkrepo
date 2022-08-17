import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz.");
        int number;
        double result=0;
        number = scanner.nextInt();

        for (double i = 1; i <=number ; i++) {
            result = result + (1/i);
        }
        System.out.println(result);
    }
}