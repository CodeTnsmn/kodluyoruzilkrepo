import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int Matematik, Fizik, Turkce, Kimya, Muzik ;
       int hesaplanan=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        Matematik=scanner.nextInt();
        if (Matematik>=0 && Matematik<=100){
           hesaplanan++;
        }else {
            System.out.println("0 ile 100 arasında olmadığı için hesaplanmadı. ");
        }
        System.out.println("Fizik notunuz : ");
        Fizik=scanner.nextInt();
        if (Fizik>=0 && Fizik<=100){
            hesaplanan++;

        }else {
            System.out.println("0 ile 100 arasında olmadığı için hesaplanmadı.");
        }
        System.out.println("Türkçe notunuz : ");
        Turkce=scanner.nextInt();
        if (Turkce>=0 && Turkce<=100){
            hesaplanan++;

        }else{
            System.out.println("0 ile 100 arasında olmadığı için hesaplanmadı.");
        }
        System.out.println("Kimya notunuz. ");
        Kimya=scanner.nextInt();
        if (Kimya>=0 && Kimya<=100){
            hesaplanan++;

        }else{
            System.out.println("0 ile 100 arasında olmadığı için hesaplanmadı.");
        }
        System.out.println("Müzik notunuz. ");
        Muzik=scanner.nextInt();
        if (Muzik>=0 && Muzik<=100){
            hesaplanan++;

        }else{
            System.out.println("0 ile 100 arasında olmadığı için hesaplanmadı.");
        }

        int ortalama = (Matematik+Muzik+Kimya+Fizik+Turkce)/hesaplanan;
        if (ortalama>55){
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }else {
            System.out.println("Sınıfı geçemediz bütlerde görüşürüz.");
        }
        System.out.println("Ortalamanız. " + ortalama);
    }
}