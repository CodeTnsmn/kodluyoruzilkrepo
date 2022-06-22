import java.util.Scanner;

public class UcgenHesaplama {



    public static void main(String[] args) {
        //değişkenler...

        int a,b,c,h;
        double alan ;

        //kullanıcıdan veri alma...

        Scanner scanner=new Scanner(System.in);

        System.out.println("1.kenar: ");

        a=scanner.nextInt();

        System.out.println("2.kenar: ");

        b=scanner.nextInt();

        System.out.println("3.kenar: ");

        c=scanner.nextInt();

        h=(a+b+c)/2;

        alan=Math.sqrt(h*(h-a)*(h-b)*(h-c));

        System.out.println("alan: "+ alan);
    }
}