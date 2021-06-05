import java.util.*;
import java.io.*;
class Sakib{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a[] = new int[x]; //taking size of array
		int b[] = new int[x]; //taking size of array
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();  //filling array 
		}
		for(int i=0;i<x;i++)
		{
			b[i]=sc.nextInt();  //filling array
		}
		System.out.println("Enter minimun days"); //taking input of minimum days
		System.out.println(sum(a,b,x));
		
	}
	public static int sum(int a[] , int b[], int x)
	{
		Integer sum=0;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<x;i++)
		{
			int difference = (b[i]-a[i]);
			al.add(difference);
		}
		for(int i=0;i<x;i++)
		sum+=a[i];
		Arrays.sort(a);
		for(int i=0;i<(x/2+1);i++)
		{
			if(i<(x/2)){
				sum=sum+al.get(i);
			}
			else
			if(al.get(i)<0)
			{
				sum=sum+al.get(i);
			}
		}
		
		return ((sum));
	}
}
