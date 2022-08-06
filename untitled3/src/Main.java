import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, k, total = 1;

        System.out.println("üssü alınacak sayı: ");
        n = scanner.nextInt();
        System.out.println("üs olacak sayı: ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(total);
    }


}

