package jan27;
import java.io.*;
import java.sql.*;
import java.util.*;
public class DBCon14 {
public static void main(String[] args) {
try {
	Scanner s=new Scanner(System.in);
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	PreparedStatement ps=con.prepareStatement("insert into Stream50 values(?,?)");
	System.out.println("enter the id:");
	String id=s.nextLine();
	ps.setString(1,id);
	System.out.println("enter fPath&fName:(source)");
	File f=new File(s.nextLine());
	if(f.exists()) {
		            FileInputStream fis=new FileInputStream(f);
		            ps.setBinaryStream(2,fis,(int)f.length());
		            int k=ps.executeUpdate();
		            if(k>0) {
			                 System.out.println("file stored successfully");
		                    }
	               }
	else {
		  System.out.println("invalid file");
		 }
	s.close();
	}catch(Exception e) {e.printStackTrace();}

}
}