import java.util.*;
import java.io.*;
class Sakib{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Integer f = sc.nextInt();
		ArrayList<Integer>pi = new ArrayList<Integer>(f);
		ArrayList<Integer>pii = new ArrayList<Integer>(f);
		ArrayList<Integer>piii = new ArrayList<Integer>(f);
		   for(int i=0;i<f;i++)
		   pi.add(sc.nextInt());
		   for(int i=0;i<f;i++)
		   pii.add(sc.nextInt());
		    for(int i=0;i<pi.size();i++){
			Integer difference=pii.get(i)-pi.get(i);
				piii.add(difference);
		    }
		    Integer a=0;
		    for(int i=0;i<pi.size();i++)
		    a+=pi.get(i);
		    Collections.sort(piii);
		    for(int i=0;i<(f/2+1);i++){
			if(i<(f/2)){
			    a+=piii.get(i);
			}
			else if(piii.get(i)<0){
			    a+=piii.get(i);
			}
		    }
		    System.out.println(a);
	}
}
