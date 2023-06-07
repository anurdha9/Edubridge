package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletRequest;

public class RegisterDAO {
    int k=0;
	public int register(ServletRequest req)
	{
		Connection con=DBConnection.getcon();
		try {
			Statement stm=con.createStatement();
			k=stm.executeUpdate("insert into registration values('"+req.getParameter("uname")+"','"+req.getParameter("pword")+"','"+req.getParameter("emailid")+"')");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return k;
		
		
	}
}
