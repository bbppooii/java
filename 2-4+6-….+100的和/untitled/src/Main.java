import java.util.Scanner;
public class Main {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        int q=0,j=1,sum=0,i=1;
        for(i=2;i<=50;i=i+2){

            if(i%4==0)
                sum=sum-i;
            else
                sum=sum+i;


        }
        System.out.println("最终结果为："+sum);
    }
}