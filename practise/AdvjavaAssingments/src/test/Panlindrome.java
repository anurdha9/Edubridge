package test;

public class Panlindrome {

	public static void main(String[] args) {
           int num=121,temp=0,sum=0,r=0;
    	   temp=num;

           while(num>0) {
        	                r=num%10;
        	                sum=sum*10+r;
        	                num=num/10;
                        }
           if(temp==sum) {
        	               System.out.println("palindrome");
                         }
           else {           System.out.println("not a palindrome");}
	}

}
