//storing data into a file
import java.io.*;
class b
{   
public static void main(String args[]) throws Exception
{DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fos=new FileOutputStream("pqr.doc");
System.out.println("enter the text");
int ch;
while((ch=dis.read())!='\n')
{
fos.write(ch);
}
fos.close();
}}