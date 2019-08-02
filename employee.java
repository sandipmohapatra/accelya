import java.io.*;
public class employee implements Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
  
}


//we can do serialization by implementing Serializable inteface.It is a marker interface.
//transient  :- if we declare the variable as transient it will not be serializable.







