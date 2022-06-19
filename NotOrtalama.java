import java.util.Scanner;

public class NotOrtalama {

    public static void main(String[] args){

        int mat,fizik,kimya,tarih,biyoloji;

        Scanner scanner = new Scanner(System.in);

        System.out.println("matematik notunuzu girin: ");

        mat= scanner.nextInt();

        System.out.println("fizik notunuzu girin: ");

        fizik= scanner.nextInt();

        System.out.println("kimya notunuzu girin: ");

        kimya=scanner.nextInt();

        System.out.println("tarih notunuzu girin: ");

        tarih=scanner.nextInt();

        System.out.println("biyoloji notunuzu girin: ");

        biyoloji=scanner.nextInt();

        int toplam= (mat+fizik+kimya+tarih+biyoloji);
        double ortalama= toplam / 5.0 ;

        System.out.println("ortalamaniz="+ ortalama);

        // string str = sonuc ? "doğru" : "yanlış" ;


        String sonuc = ortalama>60 ? "Sinifi gecti" : "Sınıfta kaldı" ;

        System.out.println(sonuc);



    }



}
