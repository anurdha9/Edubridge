package servletApp3;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/Third")
    public class ThirdServlet implements Servlet{
	public void init(ServletConfig sc)throws ServletException { }
	public void service(ServletRequest req,ServletResponse res)
	              throws ServletException,IOException{
		String pname=req.getParameter("pname");
		String pcode=req.getParameter("pcode");
		String pqty=req.getParameter("pqty");
        String pprice=req.getParameter("pprice");

		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("***Registration***");
		pw.println("<br>ProductName:"+pname);
		pw.println("<br>ProductCode:"+pcode);
		pw.println("<br>ProductQuantity:"+pqty);
        pw.println("<br>ProductPrice:"+pprice);
		
	}
	public void destroy() {}
	public String getServletInfo() {
		return "FirstServlet";
	}
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}
}
