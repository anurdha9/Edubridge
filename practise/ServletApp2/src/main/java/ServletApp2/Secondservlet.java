package ServletApp2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/second")
    public class Secondservlet implements Servlet{
	public void init(ServletConfig sc)throws ServletException { }
	public void service(ServletRequest req,ServletResponse res)
	              throws ServletException,IOException{
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String uname=req.getParameter("uname");
        String pword=req.getParameter("pword");
		String phno=req.getParameter("phno");
		String address=req.getParameter("address");

		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("***Registration***");
		pw.println("<br>FirstName:"+fname);
		pw.println("<br>UserName:"+lname);
		pw.println("<br>UserName:"+uname);
        pw.println("<br>UserName:"+pword);
		pw.println("<br>UserName:"+phno);
		pw.println("<br>UserName:"+address);

	}
	public void destroy() {}
	public String getServletInfo() {
		return "FirstServlet";
	}
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}
}
