import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gün;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylar:\n1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık\n");
        System.out.println("Hangi ayda doğdunuz. :");
        ay = scanner.nextInt();

        System.out.println("Doğum gününüzü giriniz. :");
        gün = scanner.nextInt();

        if (ay == 1) {
            if (gün < 22) {
                System.out.println("Burcunuz Oğlak");
            } else {
                System.out.println("Burcunuz Kova");
            }
        }
        if (ay == 2) {
            if (gün < 20) {
                System.out.println("Burcunuz Kova");
            } else {
                System.out.println("Burcunuz Balık");
            }
        }
        if (ay == 3) {
            if (gün < 21) {
                System.out.println("Burcunuz Balık");
            } else {
                System.out.println("Burcunuz Koç");
            }
        }
        if (ay == 4) {
            if (gün < 22) {
                System.out.println("Burcunuz Koç");
            } else {
                System.out.println("Burcunuz Boğa");
            }
        }
        if (ay == 5) {
            if (gün < 21) {
                System.out.println("Burcunuz Boğa");
            } else {
                System.out.println("Burcunuz İkizler");
            }
        }
        if (ay == 6) {
            if (gün < 23) {
                System.out.println("Burcunuz İkizler");
            } else {
                System.out.println("Burcunuz Yengeç");
            }
        }
        if (ay == 7) {
            if (gün < 23) {
                System.out.println("Burcunuz Yengeç");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        }
        if (ay == 8) {
            if (gün < 23) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Başak");
            }
        }
        if (ay == 9) {
            if (gün < 23) {
                System.out.println("Burcunuz Başak");
            } else {
                System.out.println("Burcunuz Terazi");
            }
        }
        if (ay == 10) {
            if (gün < 23) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Burcunuz Akrep");
            }
        }
        if (ay == 11) {
            if (gün < 22) {
                System.out.println("Burcunuz Akrep");
            } else {
                System.out.println("Burcunuz Yay");
            }
        }
        if (ay == 12) {
            if (gün < 22) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oğlak");
            }
        }
    }
}