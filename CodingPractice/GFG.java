/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        GFG g1=new GFG();
        String line;
        line=in.readLine();
        String[] sum,input,a1;
        int test=Integer.parseInt(line);
        for(int a=0;a<test;a++)
        {
            line=in.readLine();
            sum=line.split(" ");
            line=in.readLine();
            a1=line.split(" ");
            g1.findSub(a1,Integer.parseInt(sum[1]));
        }
	}
	
	public void findSub(String arr[],int sum)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            int begin=0,end=0,s=0,j;
            j=i+1; s=Integer.parseInt(arr[i]);
            if(i==arr.length-1 && Integer.parseInt(arr[i])!=sum)
                System.out.println("-1");
            if(j!=arr.length)
            {
                while(s<sum)
                {
                    s+=Integer.parseInt(arr[j]);
                    j++;
                    if(j==arr.length)
                        break;
                }
            }

            if(s==sum)
            {
                begin=i+1; end=j;
                System.out.println(begin+" "+end); break;
            }
        }
    }
}