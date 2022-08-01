import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int k;
       int total = 0 ;

        Scanner scanner =new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz : ");
            k=scanner.nextInt();
            if (k % 2==0 && k % 4 == 0){
                total+= k ;
            }
        }while (k%2==0);

        System.out.println("Toplam : " + total);



    }
}