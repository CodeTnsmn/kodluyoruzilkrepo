import java.util.Scanner;

public class Kitleİndeksi {
    public static void main(String[] args) {

        int kilo ;
        double boy ;
        double indeks ;

        Scanner scanner =  new Scanner(System.in);

        System.out.println("kilonuzu giriniz : ");

        kilo=scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("boyunuzu giriniz : ");

        boy=scanner1.nextDouble();


        indeks = ((kilo) / (boy * boy)) ;


        System.out.println("indeks : "+ indeks);




    }
}