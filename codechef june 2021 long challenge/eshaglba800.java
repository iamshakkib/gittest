import java.util.*;
import java.io.*;
import java.lang.*;

class test{
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
			    {
			    	int dcount = 0;
			    	int n = Integer.parseInt(br.readLine());
				String []s = (br.readLine()).split(" ");
				int arr[] = new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i] = Integer.parseInt(s[i]);
				}
				int count=0;
				for(int i=0;i<n;i++)
				{
					if(arr[i]==0)
					dcount++;
					if(arr[i]<0)
					count++;
				}
				if(dcount>1)
				dcount=1;
				System.out.println(count+dcount+1);
			    }
		
	}
}
