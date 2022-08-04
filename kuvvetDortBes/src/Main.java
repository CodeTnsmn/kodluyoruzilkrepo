import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz. ");
        k = scanner.nextInt();

        for (int i = 1,j = 1 ; i <= k ; i*=4,j*=5){

            System.out.println(i+"\n"+j);
        }

    }
}