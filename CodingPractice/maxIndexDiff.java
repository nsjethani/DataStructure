public class maxIndexDiff {
    public static void main(String args[])
    {
        maxIndexDiff md=new maxIndexDiff();
        int arr[]={9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        System.out.println(md.maxDiff(arr));
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
        i=0;j=0;maxDiff=-1;
        while(i<a.length && j<a.length)
        {
            if(left[i]<right[j])
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
