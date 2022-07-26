import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yas, mesafe;
        int yolculuktipi;
        double tutar,indTutar,indYas,indBilet,perKm = 0.10 ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen yaşınızı giriniz : ");
        yas = scanner.nextInt();
        
        if (yas<0){
            System.out.println("Hatalı veri.");
            return;
        }
        
       
        System.out.println("lütfen gideceğiniz mesafeyi giriniz : ");
        mesafe = scanner.nextInt();

        System.out.println("lütfen yolculuk tipini giriniz :\n1-Tek yön\n2-Gidiş-Dönüş ");
        yolculuktipi =scanner.nextInt();


        tutar = mesafe * 0.10 ;

        

        if (yolculuktipi==1){

            if (yas<12){
            indYas = tutar * 0.50 ;
            indTutar = tutar - indYas ;

            System.out.println("fiyat : " + indTutar);
        } else if (yas>=12 && yas<=24) {
            indYas = tutar * 0.10 ;
            indTutar = tutar - indYas ;
            System.out.println("fiyat : " + indTutar);

        }else if (yas>65) {
                indYas = tutar * 0.30;
                indTutar = tutar - indYas;
                System.out.println("fiyat : " + indTutar);

            }else {
                System.out.println("Hatalı veri.");
            }
        }else{ if (yolculuktipi==2) {
            if (yas < 12) {
                indYas = tutar * 0.50;
                indBilet = tutar * 0.20;
                indTutar = tutar - (indBilet + indYas);
                System.out.println("fiyat : " + indTutar);
            } else if (yas >= 12 && yas <= 24) {
                indYas = tutar * 0.10;
                indBilet = tutar * 0.20;
                indTutar = tutar - (indBilet + indYas);
                System.out.println("fiyat : " + indTutar);
            } else if (yas > 65) {
                indYas = tutar * 0.30;
                indBilet = tutar * 0.20;
                indTutar = tutar - (indBilet + indYas);
                System.out.println("fiyat : " + indTutar);
            }else {
                System.out.println("Hatalı veri.");
            }

        }

        }

    }
}
