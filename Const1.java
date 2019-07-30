package Tuesday;
public class Const1 
{
int empno;//instance variable
String name,address;
Const1(int empno,String name,String address)//local variable
{
	this.empno=empno;//to distinguish between instance variable and local variable we use this keyword
	this.name=name;
	this.address=address;
}
void display()
{
	System.out.println("the empno is"+empno+"name is"+name+"the address is "+address);
}
}
