import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,hesapla ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz : ");

        x = scanner.nextInt();

        System.out.println("ikinci sayıyı giriniz : ");

        y = scanner.nextInt();

        System.out.println("\n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\nLütfen yapacağınız işlemin numarasını giriniz: ");
        hesapla = scanner.nextInt();


        switch (hesapla) {
            case 1:
                System.out.println("sonuc : " + (x+y));
                break;
            case 2:
                System.out.println("sonuc : " + (x-y));
                break;
            case 3:
                System.out.println("sonuc : " + (x*y));
                break;
            case 4:
                System.out.println("sonuc : " + (x/y));
                break;
            default:
                System.out.println("yanlış işlem girdiniz. ");

        }
    }
}