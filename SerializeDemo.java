//converting variables to object and storing object into a file is known as Serialization

import java.io.*;
class employee implements Serializable
{
   String name;
   public String address;
   public transient int SSN;
   public int number;
  
}
//------------------------------------------------------------------------------------------------------------------------
public class SerializeDemo
{
   public static void main(String [] args)
   {
      employee e = new employee();
      e.name = "sandip";
      e.address = "jaynagar, 4th Block";
      e.SSN = 11123;
      e.number = 101;
      try
      {
         FileOutputStream fileOut =new FileOutputStream("abc.txt");//file will be created and open in write mode.
         ObjectOutputStream out = new ObjectOutputStream(fileOut);//write the object into the file
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in abc.txt");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}







