import java.util.Scanner;
public class Main {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        int q=0,eq=0,sum=0,i=0;
        q=sc.nextInt();
        while(q>0){
            i++;
            sum=sum+q;
            eq=sum/i;
            q=sc.nextInt();
        }
        System.out.println("最终结果为："+eq);

    }
}