/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class distinctNumInArray {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int t=0;t<test;t++)
		{
		    int count=sc.nextInt();
		    int[] a = new int[2*count+2];
		    int n=a.length;
		    
		    for(int c=0;c<n;c++)
		    {
		        a[c]=sc.nextInt();
		    }
		    distinctNum(a,n);
		  
		}
	}
	public static void distinctNum(int[] arr,int n)
	{
	    int xor=arr[0],x=0,y=0,set_bit;
	    for(int i=1;i<n;i++)
	        xor^=arr[i];
	        
	    set_bit=(xor) & ~(xor-1);
	    
	    for(int i=0;i<n;i++)
	    {
	        if((arr[i] & set_bit)>0)
	           x^=arr[i];
	        else
	            y^=arr[i];
	    }
	    
	    if(x<y)
	        System.out.println(x+" "+y);
	    else
	        System.out.println(y+" "+x);
	}
}