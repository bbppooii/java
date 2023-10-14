import java.util.Scanner;
public class Main {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        int q=0,j=0,sum=0,i=1;
        for(i=1;i<=10;i++){
            for(j=1;j<=i;j++){
                sum=sum+j;
            }

        }
        System.out.println("最终结果为："+sum);
    }
}