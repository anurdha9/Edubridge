package practise;

public class Main {

	public static void main(String[] args) {
        int a[]= {90,14,6,78,25};
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a.length;j++)
        	{
        		if(a[i]<a[j])
        		{
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        for(int j=a.length/2;j<a.length;j++)
        {
        	if(a[i]>a[j])
        	{
    			temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
	        }
        }
        }
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]+" ");
        }
	}

}
