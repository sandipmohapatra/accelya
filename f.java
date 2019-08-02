import java.io.*;
class f
{   
     public static void main(String args[]) throws Exception
      {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the empid");
int emp=Integer.parseInt(br.readLine());
System.out.println("enter the emp name");
String name=br.readLine();
System.out.println("enter the emp sal");
float sal=Float.parseFloat(br.readLine());
System.out.println("enter the empid"+emp);
System.out.println("enter the emp name"+name);
System.out.println("enter the emp sal"+sal);
 }}