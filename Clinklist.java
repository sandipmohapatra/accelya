package Thursday;
import java.util.*;
class Clinklist
{
   public static void main(String args[])  
{
  LinkedList ll=new LinkedList();
  LinkedList ll1=new LinkedList();
       ll1.add(100);            ll1.add(200);       ll1.add(300);       ll1.add(400);
       ll.add(10);       ll.add(40);       ll.add(20);       ll.add(80);       ll.add(90);       ll.add(50);
  System.out.println(ll1);  System.out.println(ll);
         ll.addFirst(100);
System.out.println(ll);
        ll.addLast(200);
System.out.println(ll);
         ll.removeFirst();         ll.removeLast();
  System.out.println(ll);
  System.out.println(ll.getFirst());
  System.out.println(ll.getLast());
   ll.addAll(ll1);
  System.out.println(ll);}}