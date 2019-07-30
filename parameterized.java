//Calling parameterized constructor from default constructor:
package This;
class Test1{  
Test1()
{  
this(15);  
System.out.println("hello student");  
}  
Test1(int x)
{  
System.out.println(x);  
}  }  
class parameterized{  
public static void main(String args[]){  
Test1 a=new Test1();  
}}  