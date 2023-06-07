package jan25;
import java.sql.*;
public class DBCon13 {
public static void main(String[] args) {
try {
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
    DatabaseMetaData dmd=con.getMetaData();
    System.out.println("productName:"+dmd.getDatabaseProductName());
    PreparedStatement ps1=con.prepareStatement("insert into product50 values(?,?,?,?)");
    ParameterMetaData pmd=ps1.getParameterMetaData();
    System.out.println("count:"+pmd.getParameterCount());
    PreparedStatement ps2=con.prepareStatement("select code ,price from product50");
    ResultSet rs=ps2.executeQuery();
    ResultSetMetaData rmd=rs.getMetaData();
    while(rs.next()) {
    	System.out.println(rs.getString(1)+"\t"+rs.getFloat(2));
    }
    System.out.println("column count:"+rmd.getColumnCount());
    }catch(Exception e) {e.printStackTrace();}
	}

}
