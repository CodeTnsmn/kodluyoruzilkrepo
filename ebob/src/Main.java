import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz :");
        int x1 = scanner.nextInt();

        System.out.print("2. Sayiyi Giriniz :");
        int x2 = scanner.nextInt();

        int ebob = 1;

        int i = 1;
        while (i <= x1 ){
            i++;
            if (x1 % i == 0 && x2 % i == 0){
                ebob = i;
            }
        }
        System.out.println("EBOB :"+ebob);
        int ekok = (x1*x2)/ebob;
        System.out.println("EKOK :"+ekok);
    }
}