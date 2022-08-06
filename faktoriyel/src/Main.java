import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,r;
        System.out.println("n değerini girin : ");
        n = scanner.nextInt();
        System.out.println("r değerini girin : ");
        r = scanner.nextInt();
        int index1=1,index2=1,fark=1 ;
        for (int i=1 ; i<n ; i++){
            index1 = index1 * i ;
        }
        for (int k=1 ; k<r ; r++){
            index2 = index2 * k ;
        }
        for (int j=1 ; j<(n-r) ; j++ ){
            fark = fark * j ;
        }
         int com = index1 / (index2 * fark);

        System.out.println("C(index1,index2) : "+ com);
    }
}