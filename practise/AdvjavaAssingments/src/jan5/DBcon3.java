package jan5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
public class DBcon3 {
public static void main(String[] args) {
	try {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the book code");
		String code=s.nextLine();
		System.out.println("enter the book name");
		String name =s.nextLine();
		System.out.println("enter the author name");
		String author =s.nextLine();
        System.out.println("enter the book price");
		float price=s.nextFloat();
		System.out.println("enter qty");
		int qty=s.nextInt();
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
	    Statement stm=con.createStatement();
	    int k=stm.executeUpdate("insert into BookDetails50 values('"+code+"','"+name+"','"+author+"',"+price+","+qty+")");
	    if(k>0) {
	    	System.out.println("Book details inserted successfully");
	    }
	    con.close();
	    s.close();
	    }
	catch(Exception e) {
		e.printStackTrace();}
	}

}
