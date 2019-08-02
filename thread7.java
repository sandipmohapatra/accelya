class First implements Runnable
{	 public void run()
	{	try	{
	Thread t=Thread.currentThread();
	String name=t.getName();
	for(int i=0;i<10;i++)
	{
	System.out.println("n="+name+"i="+i);
	Thread.sleep(500);
	}	}catch(Exception e){}	}}
class thread7
{    public static void main(String args[]) throws Exception
{     First obj=new First();
     Thread t1=new Thread(obj,"1st Bike");
     Thread t2=new Thread(obj,"2nd Bike");
     Thread t3=new Thread(obj,"3rd Bike");
        t1.start();       t2.start();       t3.start();}}