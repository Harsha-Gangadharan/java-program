import java.util.*;
public class Prime {
    public static void main (String[] argS){
        int n,flag=0;
        System.out.println("enter the limit14");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println(" prime number upto"+n);
        for(int i=1;i<n;i++){
            if(i==0||i==1)
            continue;
            flag=1;
            for(int j=2;j<=1/2;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            System.out.println(i);
        }
    }
}
