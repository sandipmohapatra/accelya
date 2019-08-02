//copy data from one file to file
import java.io.*;
class d
{  
     public static void main(String args[]) throws Exception
      {
FileInputStream fis=new FileInputStream("test.txt");
FileOutputStream fos=new FileOutputStream("demo2.doc");
int ch;
while((ch=fis.read())!=-1)
{
fos.write(ch);
}
fis.close();fos.close();
System.out.println("file copied.....");
 }}