package jan5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
public class Con2 {
public static void main(String[] args) {
try {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the product code");
	String code=s.nextLine();
	System.out.println("enter the product name");
	String name =s.nextLine();
	System.out.println("enter the product price");
	float price=s.nextFloat();
	System.out.println("enter qty");
	int qty=s.nextInt();
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
    Statement stm=con.createStatement();
    int k=stm.executeUpdate("insert into product50 values('"+code+"','"+name+"',"+price+","+qty+")");
    if(k>0) {
    	System.out.println("product details inserted successfully");
    }
    con.close();
    s.close();
    }
catch(Exception e) {
	e.printStackTrace();}
}
	}



