package practise;
public class Demo1 {
 public static void main (String args[])
 {
	int a[]= {23,45,56,7,7,45,7};
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>0)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			b[i]=count;
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>0)
		{
			if(b[i]==1)
			{
				System.out.println("repetive elements:"+a[i]+" ");
			}
		}
	}
 }
}
