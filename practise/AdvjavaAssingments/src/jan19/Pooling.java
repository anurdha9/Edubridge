package jan19;
import java.util.*;
import java.sql.*;
public class Pooling {
public String url,uname,pword;
public Pooling(String url,String uname,String pword) {
	this.url=url;
	this.uname=uname;
	this.pword=pword;
}
public Vector<Connection> v=new Vector<Connection>();
public void createConnection() {
	try {
		while(v.size()<5) {
			System.out.println("pool is not full....");
			Connection con=DriverManager.getConnection(url,uname,pword);
			v.add(con);
			System.out.println(con);
		}
		if(v.size()==5) {
		System.out.println("pool is full....");	
		}
		}catch(Exception e) {e.printStackTrace();}
}
public synchronized Connection useConnection()
{
 Connection con=v.firstElement();
 v.removeElementAt(0);
 return con;
}
 public synchronized void returnConnection(Connection con) {
	 v.addElement(con);
	 System.out.println("connection added back to pool....");
 }
 }
