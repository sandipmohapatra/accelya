//calling default constructor within a parameterized constructor
package This;
class Test{  
Test()
{	System.out.println("default constructor");
	}  
Test(int x)
{  
this();  
System.out.println(x);  
}}  
class Default{  
public static void main(String args[]){  
Test a=new Test(10);  
}}  