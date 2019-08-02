public class Thread1 extends Thread 
{
public void run()
{	try{
	for(int i=1;i<=10;i++)
	{		System.out.println(i);
		sleep(1000);		}}
catch(Exception ae)
{	ae.printStackTrace();}}
public static void main(String[] args)
{
	Thread1 ob=new Thread1();
	Thread1 ob1=new Thread1();
	Thread1 ob2=new Thread1();
	ob.start();ob1.start();ob2.start();
	}}
