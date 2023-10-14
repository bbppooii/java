import java.util.Scanner;
public class Main {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        int q=0,j=1,sum=0,i=0,a=0;
        i=sc.nextInt();
        a=i;
        for(;i>=1;i--){
            for(q=0;q<a-i;q++){
                System.out.print(' ');
            }
            for(j=i*2;j>1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}