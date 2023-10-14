public class Main {
    public static void main(String  args[]){
        int a=1;
        int sum=0;
        while (a!=0) {
            sum=a+sum;
            a++;
            if(a>100)break;
        }
        System.out.println("sum的最终结果为："+sum);
        a=1;
        sum=0;
        do {
            sum=a+sum;
            a++;
            if(a>100)break;
        }while (a!=0);
        System.out.println("sum的最终结果为："+sum);
        a=1;
        sum=0;
        for(;a<=100;a++){
            sum=sum+a;
        }
        System.out.println("sum的最终结果为："+sum);
    }
}


