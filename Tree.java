package Thursday;
import java.util.*;
class Tree
{
   public static void main(String args[])  
{
 HashSet hs=new HashSet();
 Integer a=new Integer(10);
 hs.add(a); 
 Float b=new Float(10.35);
 hs.add(b);
String name=new String("raj");
hs.add(name);
a obj=new a();
hs.add(obj);
System.out.println(hs);
for(Object x:hs)
System.out.println(x);
    Iterator  ii=hs.iterator();
while(ii.hasNext())
{  System.out.println(ii.next());
   ii.remove();}
System.out.println(hs);}}