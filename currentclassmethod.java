package This;
class current{  
void m()
{	System.out.println("hello madam");	}  
void n()
{  
System.out.println("hello students");  
 this.m();  
}  }  
class currentclassmethod
{  
public static void main(String args[])
{  
current a=new current();  
a.n();  
}}  