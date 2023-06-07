package test;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/reg")
public class RegisterationServlet implements Servlet{

	public void destroy() {}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

	public void init(ServletConfig sc) throws ServletException {
		try {
			Connection con=DBConnection.getcon();
			PreparedStatement ps=con.prepareStatement("insert into registration values(?,?,?)");
		}catch(Exception e) {e.printStackTrace();
		}
	}
	

	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
	String username=req.getParameter("uname");
	String password=req.getParameter("pword");
	String emailid=req.getParameter("emailid");
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	int k=new RegisterDAO().register(req);
	if(k>0)
	{
		pw.println("Registration Successfull......");
		RequestDispatcher rd=req.getRequestDispatcher("register.html");
		rd.include(req, res);
	}
	
    pw.println("***Registration***");
    pw.println("<br>username:"+username);
    pw.println("<br>password:"+password);
    pw.println("<br>emailid:"+emailid);

	}

}
