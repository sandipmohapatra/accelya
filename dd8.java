class a implements Runnable
{
int available=1;

synchronized public void run()
	{

	try
	{
	Thread t=Thread.currentThread();
	String name=t.getName();
	if(available==1)
	{
	System.out.println(name+"  got the ticket");
	System.out.println("ticket printing.......");
	Thread.sleep(2000);
	available=available-1;
	}
	else
	{
	System.out.println(name+"   sorry no ticket....");
	}
	
	}catch(Exception e){}
	}
}

class dd8
{
    public static void main(String args[]) throws Exception
{ 
     a obj=new a();
    new a();
     Thread t1=new Thread(obj,"raj");
 Thread t2=new Thread(obj,"seeta");
 Thread t3=new Thread(obj,"reeta");
        t1.start();
       t2.start();
       t3.start();
}
}

