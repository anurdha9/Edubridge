package ServletApp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/first")

public class FirstServlet implements Servlet{
public void init(ServletConfig sc)throws ServletException { }
public void service(ServletRequest req,ServletResponse res)
              throws ServletException,IOException{
	String uname=req.getParameter("uname");
	String mId=req.getParameter("mid");
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	pw.println("***UserDetails***");
	pw.println("<br>UserName:"+uname);
	pw.println("<br>MailId:"+mId);
}
public void destroy() {}
public String getServletInfo() {
	return "FirstServlet";
}
public ServletConfig getServletConfig() {
	return this.getServletConfig();
}
}
