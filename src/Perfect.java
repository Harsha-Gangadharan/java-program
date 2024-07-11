import java.util.*;
public class Perfect {
    public static void main(String[] args) {
        int sum=0,num;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextInt();
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num)
{
    System.out.println(num+"is perfect");
}else if (sum>num) {
    System.out.println(num+"is abundant");
    
}else{
    System.out.println(num+"is deficient");
}
    }
    
}
