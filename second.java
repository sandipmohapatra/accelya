package Tuesday;
import java.util.*;
public class second
{
public static void main(String[] args)
{
	int position, c, n;
	 Scanner ob=new Scanner(System.in);
	   System.out.println("Enter number of elements in array\n");
	   n=ob.nextInt();
	   int array[]=new int[n];
	     for (c = 0; c < n; c++)
	      array[c]=ob.nextInt();
	 
	   System.out.println("Enter the position where you wish to delete element\n");
	   position=ob.nextInt();
	 
	   if (position >= n+1)
	      System.out.println("Deletion not possible.\n");
	   else
	   {
	      for (c = position - 1; c < n - 1; c++)
	         array[c] = array[c+1];
	 	      System.out.println("Resultant array:\n");
	 	      for (c = 0; c < n - 1; c++)
	         System.out.println(array[c]);
	      System.out.println(array.length);
	      System.out.println(array[n-1]);
	   }	}	}
