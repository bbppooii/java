import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int q=0,a=0,sum=0,i=1;
        a=r.nextInt(1,10);
        q=sc.nextInt();
        while(q!=a){
            ++i;
            if(q>a)
                System.out.println("猜大了");
            else
                System.out.println("猜小了");
            q=sc.nextInt();
        }
        System.out.println("最终结果为："+i);
    }
}