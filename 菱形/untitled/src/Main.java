import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = 0, j = 1, sum = 0, i = 1, a = 0;
        i = sc.nextInt();
        a = i;
        for (i = 1; i <= a/2; i++) {
            for (q = a - i; q >= 0; q--) {
                System.out.print(' ');
            }
            for (j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if (a%2!=0){
            for(q=i;q>0;q--){
                System.out.print(' ');
            }
            for(i=a;i>0;i--){
                System.out.print('*');
            }
            System.out.println();
        }
        for (i = a/2; i >=1 ; i--) {
            for (q = a - i; q >= 0; q--) {
                System.out.print(' ');
            }
            for (j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}