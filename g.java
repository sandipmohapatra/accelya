import java.io.*;
class g
{   
public static void main(String args[]) throws Exception
{
FileReader fr=new FileReader("test.txt");
BufferedReader br=new BufferedReader(fr);
String name;
while((name=br.readLine())!=null)
{
System.out.print(name);
}
fr.close();br.close();
System.out.println("file copied.....");
}}