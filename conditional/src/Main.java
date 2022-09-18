public class Main {
    public static void main(String[] args) {
      String mesaj = "kodlamaİO" ;
      String giris = "kodlamaİO" ;

      if (giris == mesaj){
          System.out.println("java dersine giriş yapıldı. " + mesaj);
      }else{
          System.out.println("Giris yapılamadı. " + mesaj);
      }


      int calismaSaati = 8;
      if (calismaSaati<6){
          System.out.println("Yeterli çalışma yapılamadı.");
      } else if (calismaSaati==6) {
          System.out.println("İdeal çalışma saati. ");
      }else {
          System.out.println("Çok iyi çalışıldı,tebrikler kodlamaya devam.");
      }
    }
}