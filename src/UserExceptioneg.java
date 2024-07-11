import java.lang.*;
class UserExceptioneg extends Exception
{
 UserExceptioneg(String m)
 {
 super(m);
 }
}
class Exceptioneg
{
public static void main(String args[])
{
int x=5,y=1000;
try
{
float z=(float)x/(float)y;
if(z<0.01)
{
throw new UserExceptioneg("Number is too small");
}
}
catch(UserExceptioneg e)
{
System.out.println(e.getMessage());
}
finally{
System.out.println("Close");
}
}
}