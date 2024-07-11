import java. util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,num,i;
        System.out.println("enter the limit");
        Scanner s =new Scanner(System.in);
        num=s.nextInt();
        System.out.println("the fibonacci series is :");
        System.out.println(n1+""+n2+"");
        for(i=2;i<num;i++){
            n3=n1+n2;
            System.out.println(n3+"");
            n1=n2;
            n2=n3;
        }
    }
    
}
