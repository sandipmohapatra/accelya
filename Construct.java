package Tuesday;
public class Construct
{
Construct()
{	System.out.println("default constructor");}
Construct(int a,int b)
{System.out.println("the sum is "+(a+b));}
int sum(int a,int b)//function overloading 
{return a+b;}
float sum(float a,float b)
{	return a+b;}
public static void main(String[] args) 
{	Construct ob=new Construct();
	Construct ob1=new Construct(3,4);
	System.out.println("the method sum is"+ob.sum(5, 6));
	System.out.println("the method sum is"+ob.sum(5.4f, 6.4f));
	}}