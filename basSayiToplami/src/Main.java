import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz.");

        int number = scanner.nextInt();

        int basNumber = 0,result=0,kalan;

        while (number !=0){
            kalan = number % 10 ;
            result += kalan;
            number /= 10;
        }
        System.out.println(result);

    }
}