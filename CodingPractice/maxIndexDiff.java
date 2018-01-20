/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class maxIndexDiff {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
	
		for(int t=0;t<test;t++)
		{
		    maxIndexDiff g1=new maxIndexDiff();

            int count=0;
            count=s.nextInt();
            int[] array = new int[count];

            for(int i = 0; i < count ; i++)
                array[i] = s.nextInt(); 
            
            System.out.println(g1.maxDiff(array));
		}
	}
	int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    int min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
    int maxDiff(int a[])
    {
        if(a.length==0)
            return 0;
        int left[]=new int[a.length];
        int right[]=new int[a.length];
        left[0]=a[0];
        for(int b=1;b<a.length;++b)
        {
            left[b]=min(a[b],left[b-1]);
        }
        right[a.length-1]=a[a.length-1];
        for(int c=a.length-2;c>=0;--c)
        {
            right[c]=max(a[c],right[c+1]);
        }
        int i,j,maxDiff;
        i=0;j=0;maxDiff=0;
        while(i<a.length && j<a.length)
        {
            if(left[i]<=right[j])
            {
                maxDiff=max(maxDiff,j-i);
                j++;
            }
            else
                i++;
        }
        return maxDiff;
    }
}