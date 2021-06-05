import java.util.*;
import java.io.*;
class hoare{
	static int partition(int arr[],int l,int h,int x){
		int temp = arr[l];
		arr[l] = arr[x];
		arr[x]=temp;
		int pivot = arr[l];
		System.out.println(pivot+"hlw");
		int i=l-1;int j = h+1;
		while(true)
		{
			do{
				i++;
			}while(arr[i]<pivot);
			do{
				j--;
			}while(arr[j]<pivot);
			if(i>=j)
			{
				return arr[j];
			}
			System.out.println(arr[j]+"gyiyf");
			System.out.println(arr[i]+"vyvyv");
			temp = arr[j];
			arr[j]=arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int l=0,h=n-1;
		int x = sc.nextInt();
		System.out.println(partition(arr,l,h,x)+"here");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
