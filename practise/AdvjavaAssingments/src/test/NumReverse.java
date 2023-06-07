package test;

public class NumReverse {

	public static void main(String[] args) {
          int n=1228,r=0,temp=0;
          while(n>0) {
        	         temp=n%10;
        	         r=r*10+temp;
        	         n=n/10;
          }
          System.out.println("reverse num:"+r);
	}
}
