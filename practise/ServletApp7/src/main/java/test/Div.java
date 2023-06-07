package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/Div")
public class Div implements Servlet{

	public void init(ServletConfig sc)throws ServletException{}

	public void destroy() {
		
	}
    public ServletConfig getServletConfig() {
		return null;
	}
    public String getServletInfo() {
		return null;
	}
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	int a=Integer.parseInt(req.getParameter("v1"));
	int b=Integer.parseInt(req.getParameter("v2"));
	int c=a/b;
	pw.println("Div:"+c+"<br>");
	RequestDispatcher rd=req.getRequestDispatcher("input.html");
	rd.include(req,res);	
	}
	}

