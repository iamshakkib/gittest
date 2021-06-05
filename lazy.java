import java.util.*;

class B{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long mod=1000000007l;
        int cases=sc.nextInt();

        while(cases>0)
        {
            cases--;
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[m];
            for(int j=0;j<m;j++)
            {
                arr[j]=sc.nextInt();
            }
            int ans=Integer.MAX_VALUE;

            int l=0;
            int r=0;
            Map<Integer,Integer> map=new HashMap<>();
            Map<Integer,Integer> map2=new HashMap<>();

            for(int j=0;j<m;j++)
            {
                map2.putIfAbsent(arr[j],0);
                map2.put(arr[j],map2.get(arr[j])+1);
            }
            for(int j=0;j<m;j++)
            {
                if(r==m)
                {
                    break;
                }

                map.put(arr[j],1);
                while(map.containsKey(arr[r])||(map2.containsKey(arr[r])&&map2.get(arr[r])>1))
                {

                    map2.put(arr[r],map2.get(arr[r])-1);
                    r++;
                    if(r==m)
                    {
                        break;
                    }


                }

                int temp=(j+1)+(m-1-r);
                ans=Math.min(ans,temp);
            }

            map.clear();
            int c=0;
            for(int j=0;j<m;j++)
            {
                map.put(arr[m-1-j],1);
                c++;
                if(map.size()==n)
                {
                    ans=Math.min(ans,c-1);
                }
            }
            System.out.println(ans+1);

        }

    }
}

