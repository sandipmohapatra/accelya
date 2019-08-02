import java.io.*;
public class DeserializeDemo
{
   public static void main(String [] args)
   {
      employee e = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("abc.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (employee) in.readObject();
         in.close();
         fileIn.close();
      }	
catch(IOException i)
      {         

i.printStackTrace();
System.out.println(i);
               }
catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
             } 
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("sssn no: " + e.SSN);
      System.out.println("Number: " + e.number);
    }
}

