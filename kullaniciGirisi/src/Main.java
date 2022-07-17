import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String username,password,newpassword = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınız : ");
        username = scanner.nextLine();

        System.out.println("Şifreniz : ");
        password=scanner.nextLine();

        if (username.equals("patika") && password.equals("12345")){
            System.out.println("Giriş yaptınız :");
        }else {
            System.out.println("Bilgileriniz yanlış,Şifreyi sıfırlamak istermisiniz.Evet/Hayır : ");
            if (scanner.nextLine().equals("Evet")) {
                System.out.println("yeni şifre :");
                newpassword = scanner.nextLine();
                if (newpassword.equals("12345")) {
                    System.out.println("Şifre aynı olamaz.tekrar deneyin. ");
                }else {
                    System.out.println("Şifre değiştirme başarılı,giriş yapınız. ");
                }

            }else {
                System.out.println("Giriş başarısız. ");
            }

        }

    }
        }


