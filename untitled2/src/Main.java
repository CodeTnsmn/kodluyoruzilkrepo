import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int k ;

      System.out.println("sayı giriniz. ");
      k=scanner.nextInt();

      int total=0,sayac=0;
      for (int i=0; i<=k ; i++){
          if (i%3==0 && i%4==0){
              total+=i;
              sayac++;
          }
      }
      double ort  =total / sayac ;

        System.out.println("ortalama : " + ort);

    }
}