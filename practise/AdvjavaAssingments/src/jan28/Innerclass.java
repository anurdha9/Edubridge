package jan28;

public class Innerclass {
      public static char[] c;

	class Inner{
    	  static void add( int a, int b) {
    		 int c=a+b;
    	  }
      
	public static void main(String[] args) {
   Innerclass i=new Innerclass();
   Innerclass.Inner.add(34,67);
   System.out.println(c);
	}
      }
}
