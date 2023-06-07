package jan28;

@FunctionalInterface
interface test{
	   int add(int a,int b);
       }
public class Prog1 {
public static void main(String[] args) {
	test t=(a,b)->a+b;
    int x=t.add(23,45);
    System.out.println(x);
	}
}
