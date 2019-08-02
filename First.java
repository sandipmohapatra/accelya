import java.io.*;
import java.util.*;
class First
{public static void main(String arg[])
{	Scanner ob=new Scanner(System.in);
	System.out.println("enter the file name");
String fname=ob.next();
File f=new File(fname);
System.out.println("file name:"+f.getName());
System.out.println("file name:"+f.getPath());
System.out.println("file name:"+f.getAbsolutePath());
System.out.println("file name:"+f.exists());
if(f.exists()){
System.out.println("file name:"+f.canWrite());
System.out.println("file name:"+f.canRead());
System.out.println("file name:"+f.isDirectory());
System.out.println("file name:"+f.length());}}} 
