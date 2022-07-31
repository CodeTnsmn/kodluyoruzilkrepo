import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yil;

        System.out.println("Doğum yılınızı giriniz. ");
        yil = scanner.nextInt();

        if (yil%4==0){
            System.out.println(yil + "bir artık yıldır. ");
        } else if (yil%400==0) {
            System.out.println(yil + "bir artık yıldır. ");
        }else{
            System.out.println(yil + "bir artık yıl değildir. ");
        }

    }
}