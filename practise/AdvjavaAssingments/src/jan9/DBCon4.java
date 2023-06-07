package jan9;
import java.sql.*;
import java.util.Scanner;
public class DBCon4 {
public static void main(String[] args) {
try {
	Scanner s=new Scanner(System.in);
	System.out.println("enter accno:");
	long accno=Long.parseLong(s.nextLine());
	System.out.println("enter custid:");
	int cid=Integer.parseInt(s.nextLine());
	System.out.println("enter custname:");
	String cname=s.nextLine();
	System.out.println("enter balance:");
	float bal=Float.parseFloat(s.nextLine());
	System.out.println("enter acctype:");
	String acctype=s.nextLine();
	System.out.println("enter hno:");
	String hno=s.nextLine();
	System.out.println("enter streetname:");
	String sname=s.nextLine();
	System.out.println("enter city:");
	String city=s.nextLine();
	System.out.println("enter state:");
	String state=s.nextLine();
	System.out.println("enter pincode:");
	int pincode=Integer.parseInt(s.nextLine());
	System.out.println("enter mailid:");
	String mid=s.nextLine();
    System.out.println("enter phoneno:");
	long phno=Long.parseLong(s.nextLine());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
CallableStatement cs=con.prepareCall("{call register50(?,?,?,?,?,?,?,?,?,?,?,?)}");
cs.setLong(1, accno);
cs.setInt(2,cid);
cs.setString(3, cname);
cs.setFloat(4, bal);
cs.setString(5, acctype);
cs.setString(6, hno);
cs.setString(7, sname);
cs.setString(8, city);
cs.setString(9, state);
cs.setInt(10, pincode);
cs.setString(11, mid);
cs.setLong(12, phno);
cs.execute();
System.out.println("customer registered");
s.close();
}catch(Exception e) {e.printStackTrace();}
	}

}
