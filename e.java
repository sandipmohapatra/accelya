import java.io.*;
class e
{   //copy file to file
     public static void main(String args[]) throws Exception
      {
FileInputStream fis=new FileInputStream("test.txt");//open in read mode
FileOutputStream fos=new FileOutputStream("demo1.doc");//open in write mode
BufferedInputStream bis=new BufferedInputStream(fis);
BufferedOutputStream bos=new BufferedOutputStream(fos);
int ch;
while((ch=bis.read())!=-1)
{
bos.write(ch);
}
bos.close();fis.close();fos.close();
System.out.println("file copied....."); }}