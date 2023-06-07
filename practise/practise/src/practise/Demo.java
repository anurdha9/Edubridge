package practise;

public class Demo {
public static void main(String args[]) {
	int a[]= {90,12,90,78,56,12,12};
	int b[]= new int[a.length];
	int count;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>0)
		{
			count=1;
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
	System.out.println(a[i]+" occured "+b[i]+" times");
}
}
}