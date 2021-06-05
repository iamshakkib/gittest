import java.util.*;
import java.io.*;
class mergesort{
	static void partition(int arr[],int l,int n,int p)
	{
		int pivot = arr[n-1];
		int i = l-1;
		int temp = 0;
		temp = arr[p];
		arr[p] = pivot;
		pivot = temp;
		for(int j=l;j<n-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp=arr[i+1];
		System.out.println(arr[i+1]+"here");
		System.out.println(pivot+"here");
		arr[i+1]=pivot;
		pivot=temp;
		
	}
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		int l=0,h=n;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int p = sc.nextInt();
		partition(arr,l,n,p);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}	
}
