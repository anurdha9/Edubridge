package jan6;
import java.util.*;
import java.sql.*;
public class Con3 {
public static void main(String[] args) {
try {
	Scanner s=new Scanner(System.in);
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	PreparedStatement ps1=con.prepareStatement("insert into bookdetails50 values(?,?,?,?,?)");
	PreparedStatement ps2=con.prepareStatement("select * from bookdetails50");
	PreparedStatement ps3=con.prepareStatement("select * from bookdetails50 where code=?");
	PreparedStatement ps4=con.prepareStatement("update bookdetails50 set price=?,qty=qty+? where code=?");
	PreparedStatement ps5=con.prepareStatement("delete from bookdetails50 where code=?");
while(true) {
	System.out.println("****Choice****");
	System.out.println("\t1.Add bookdetails"+"\n\t2.View all bookdetails"+"\n\t3.view book by code"+
	"\n\t4.update bookdetails"+"\n\t5.delete book by code"+"\n\t6.exit");
	System.out.println("enter the choice");
	int choice=Integer.parseInt(s.nextLine());
	switch(choice) 
	{
	case1:
		System.out.println("enter book code:");
	    String code=s.nextLine();
	    System.out.println("enter book name:");
	    String name=s.nextLine();
	    System.out.println("enter book author:");
	    String author=s.nextLine();
	    System.out.println("enter book price:");
	    float price=Float.parseFloat(s.nextLine());
	    System.out.println("enter book qty:");
	    int qty=Integer.parseInt(s.nextLine());
	    ps1.setString(1, code);
	    ps1.setString(2, name);
	    ps1.setString(3, author);
	    ps1.setFloat(4, price);
	    ps2.setInt(5, qty);
	    int k=ps1.executeUpdate();
	    if(k>0) {System.out.println("bookdetails inserted"); }
	    break;
case2:
	 ResultSet rs1=ps2.executeQuery();
    while(rs1.next()) {
	System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"
    +rs1.getString(3)+"\t"+rs1.getFloat(4)+"\t"+rs1.getInt(5));}
    break;
case3:
	System.out.println("enter book code:");
    String bcode=s.nextLine();
    ps3.setString(1,bcode);
	ResultSet rs2=ps3.executeQuery();
    while(rs2.next()) {
	System.out.println(rs2.getString(1)+"\t"+rs2.getString(2)+"\t"
    +rs2.getString(3)+"\t"+rs2.getFloat(4)+"\t"+rs2.getInt(5)); }
    {System.out.println("invalid book code");}
    break;
case4:
	 System.out.println("enter the book code");
	 String bcode2=s.nextLine();
	 ps3.setString(1,bcode2);
	 ResultSet rs3=ps3.executeQuery();
	 if(rs3.next())
	 {
	  System.out.println("old price:"+rs3.getFloat(4));
	  System.out.println("enter new price");
	  float nprice=Float.parseFloat(s.nextLine());
	  System.out.println("existing qty:"+rs3.getInt(5));
	  System.out.println("enter the qty");
	  int nqty=Integer.parseInt(s.nextLine());
	  ps4.setFloat(1, nprice);
	  ps4.setInt(2, nqty);
	  ps4.setString(3, bcode2);
	  int k1=ps4.executeUpdate();
	  if(k1>0) { System.out.println("book details updated"); }
	 }
	 else {System.out.println("invalid book code"); }
	 break;
case5:
		 System.out.println("enter the bookcode");
	     String bcode3=s.nextLine();
	     ps3.setString(1, bcode3);
	     ResultSet rs4=ps3.executeQuery();
	     if(rs4.next())
	     {
	     ps5.setString(1, bcode3);
	     int k3=ps5.executeUpdate();
	     if(k3>0){System.out.println("bookdetails deleted");}
	     }
	     else {System.out.println("invalid bookcode");}
	     break;
case6:System.out.println("operations stoped");
	  System.exit(0);
default:System.out.println("invalid choice");
}
}
}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
