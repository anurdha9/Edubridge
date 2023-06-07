package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/first")
public class RegisterForm implements Servlet{
	
	
	public void init(ServletConfig sc) throws ServletException {}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String add=req.getParameter("add");
		String age=req.getParameter("age");
		String qualification=req.getParameter("qualification");
		String per=req.getParameter("per");
		String yr=req.getParameter("yr");
        PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("****Registration Form****");
		pw.println("<br>FullName:"+fname);
		pw.println("<br>Address:"+add);
		pw.println("<br>Age:"+age);
		pw.println("<br>Qualification:"+qualification);
		pw.println("<br>Percentage:"+per);
		pw.println("<br>PassedYear:"+yr);
	}
      public void destroy() {}

	
	 public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}

	public String getServletInfo() {
		return null;
	}
}