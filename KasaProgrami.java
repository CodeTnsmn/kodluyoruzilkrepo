import java.util.Scanner;

public class KasaProgrami {
    public static void main(String[] args) {

        double Armut;
        double Elma;
        double Domates;
        double Muz;
        double Patlican;
        double kilo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kac kilo: ");
        kilo = scanner.nextDouble();
        Armut = kilo * 2.14d;

        System.out.print("Elma kac kilo: ");
        kilo = scanner.nextDouble();
        Elma = kilo * 3.67d;

        System.out.print("Domates kac kilo: ");
        kilo = scanner.nextDouble();
        Domates = kilo * 1.11d;

        System.out.print("Muz kac kilo: ");
        kilo = scanner.nextDouble();
        Muz = kilo * 0.95d;

        System.out.print("Patlıcan kac kilo: ");
        kilo = scanner.nextDouble();
        Patlican = kilo * 5.00d;

        System.out.println("Toplam Fiyat: "+(Armut+Elma+Domates+Muz+Patlican));






    }
}