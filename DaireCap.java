import java.util.Scanner;

public class DaireCap {
    public static void main(String[] args) {

        int r ;
        double pi = 3.14 ;
        double a ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("dairenin yaricapi : ");

        r = scanner.nextInt();

        Scanner scannera = new Scanner(System.in);

        System.out.println("aci giriniz: ");

        a = scannera.nextDouble() ;

        double alan = pi*r*r ;
        double cevre = 2 * pi * r;
        double merkezAlan = (pi*(r*r)*a);

        System.out.println("alan : "+ alan);
        System.out.println("cevre: "+ cevre);



    }
}