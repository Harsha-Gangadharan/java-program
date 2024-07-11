
import java.io.*;
class files
{
public static void main(String args[])throws IOException
{
int c;
BufferedInputStream a=new BufferedInputStream(new 
FileInputStream(args[0]));
BufferedOutputStream b=new BufferedOutputStream(new 
FileOutputStream(args[1]));
do
{
c=a.read();
if(c!=-1){
b.write((byte)c);
}
}while(c!=-1);
}
}
class fileio
{
public static void main(String args[])throws IOException
{
String n[]={"in.txt","out.txt"};
files.main(n);
}
}
