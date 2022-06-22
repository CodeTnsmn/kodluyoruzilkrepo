import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran,kdv,kdvliFiyat;
        boolean kdvDurumu;

        Scanner scanner=new Scanner(System.in);
        System.out.println("ucret tutarini giriniz: ");
        tutar=scanner.nextDouble();

        kdvDurumu = (tutar>0) && (tutar<1000);
        kdvOran= kdvDurumu ? 0.18d : 0.8d ;

        kdv = tutar * kdvOran ;
        kdvliFiyat = kdv+ tutar ;



        System.out.println("KDV siz Tutar :"+ tutar);
        System.out.println("KDV Oranı :"+ kdvOran);
        System.out.println("KDV Miktarı : " + kdv);
        System.out.println("KDV li Tutarı :"+ kdvliFiyat);






    }
}