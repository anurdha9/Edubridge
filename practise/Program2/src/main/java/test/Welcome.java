package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/Welcome")
public class Welcome implements Servlet{

	public void destroy() {}
    public ServletConfig getServletConfig() {
		return null;
	}
    public String getServletInfo() {
		return null;
	}
    public void init(ServletConfig sc) throws ServletException {}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String User=req.getParameter("User");
		System.out.println("Hello"+User);
	}

}
