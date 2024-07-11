import java.util.*;
public class GreatestDivisor {
    public static void main(String[] args) {
        int a,b,i,g=1;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the numbers you want to find the gcd ");
        a=s.nextInt();
        b=s.nextInt();
        for(i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0)
            g=i;
        }
        System.out.println("gcd of"+a+"and"+b+"is"+g);
    }
}
