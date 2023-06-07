package jan27;
import java.sql.*;
import java.util.*;
import java.io.*;
public class DBCon15 {
public static void main(String[] args) {
try {
	Scanner s=new Scanner(System.in);
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	PreparedStatement ps=con.prepareStatement("select * from Stream50 where id=?");
	System.out.println("enter the id:");
	String id=s.nextLine();
	ps.setString(1,id);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		           Blob b=rs.getBlob(2);
		           byte by[]=b.getBytes(1, (int)b.length());
		           System.out.println("enter fPath&fName:(destination");
		           File f= new File(s.nextLine());
		           FileOutputStream fos=new FileOutputStream(f);
		           fos.write(by);
		           System.out.println("sream retrieved successfully");
		           fos.close();
	             }
	        else { System.out.println("invalid id");	
	             }
    s.close();
    }catch(Exception e) {e.printStackTrace();}
}
}