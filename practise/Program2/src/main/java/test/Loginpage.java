package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/LoginPage")
public class Loginpage implements Servlet {

    public void init(ServletConfig sc) throws ServletException {}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		String User=req.getParameter("User");
		String Pwd=req.getParameter("Pwd");
		if(User.equals("anu")&&(Pwd.equals("123")))
		{
		  RequestDispatcher rd=req.getRequestDispatcher("Welcome");
		  rd.forward(req, res);
		}
		else
		{
		  System.out.println("UserName or Password incorrect");
		  RequestDispatcher rd=req.getRequestDispatcher("index.html");
		  rd.include(req, res);
		}
	}
	public void destroy() {}

	public ServletConfig getServletConfig() {
			return null;
		}

		public String getServletInfo() {
			return null;
		}
}
