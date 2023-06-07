package test;

public class Swap {

	public static void main(String[] args) {
           int x=5,y=10;
           System.out.println("before swapping:"+" "+"x="+x+" "+"y="+y);
           x=x+y;
           y=x-y;
           x=x-y;
           System.out.println("After swapping:"+" "+"x="+x+" "+"y="+y);
	}

}
