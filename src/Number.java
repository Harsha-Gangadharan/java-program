import java.util.*;
public class Number {
    public static void main(String[] args) {
        int ec=0,oc=0,pc=0,nc=0,zc=0;
        int a[]=new int[10];
        Scanner s= new Scanner(System.in);
        System.out.println("enter the elements of array");
        for(int i=0;i<10;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]%2==0){
                ec++;
            }
            else{
                oc++;
            }if(a[i]>0){
                pc++;
            }else if(a[i]<0){
                nc++;
            }else{
                zc++;
            }
        }
        System.out.println("count of even numbers:"+ec);
        System.out.println("count of odd numbers:"+oc);
        System.out.println("count of positive numbers:"+pc);
        System.out.println("count of negative numbers:"+nc);
        System.out.println("count of zero numbers:"+zc);
    }
}
