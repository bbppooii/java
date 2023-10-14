public class Main {
    public static void main(String  args[]){
        int a[]=new int[100];
        a[1]=1;
        a[2]=1;
        long sum=2;
        for(int i=3;i<=20;i++){
            a[i]=a[i-1]+a[i-2];
            sum=sum+a[i];
        }
        System.out.println("sum的最终结果为："+sum);
    }
}