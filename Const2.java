package Tuesday;
public class Const2 extends Const1
{
	int phoneno;
	Const2(int empno,String name,String address,int phoneno)
	{
		super(empno,name,address);
		this.phoneno=phoneno;
			}
	void display()
	{
		super.display();
		System.out.println("the phoeno is "+phoneno);
	}
public static void main(String[] args) {
	Const2 ob=new Const2(101,"sandip","bangalore",1234);
	ob.display();}}
