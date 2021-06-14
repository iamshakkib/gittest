//BITTUP

import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args) throws IOException
	{
		try{
			//Your Solve
			long mod = 1000000007;
			BufferedReader sc = new BufferedReader (new InputStreamReader (System.in));
			int t = Integer.parseInt(sc.readLine());
			while(t-->0)
			{
				String []s=(sc.readLine()).split(" ");

				long n=Long.parseLong(s[0]);

				long m=Long.parseLong(s[1]);
				long res;
				res = power(2,n,mod)-1;
				System.out.println(power(res,m,mod));
			}
			sc.close();
		}catch(Exception e){
			return;
		}
	}
	  static long power(long x, long y, long p)
	  {
	    long res = 1; // Initialize result
	 
	    x = x % p; // Update x if it is more than or
	    // equal to p
	 
	    if (x == 0)
	      return 0; // In case x is divisible by p;
	 
	    while (y > 0)
	    {
	 
	      // If y is odd, multiply x with result
	      if ((y & 1) != 0)
		res = (res * x) % p;
	 
	      // y must be even now
	      y = y >> 1; // y = y/2
	      x = (x * x) % p;
	    }
	    return res;
	  }
}
