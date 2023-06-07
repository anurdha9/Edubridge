package servletApp4;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/fourth")
    public class FourthServlet implements Servlet{
	public void init(ServletConfig sc)throws ServletException { }
	public void service(ServletRequest req,ServletResponse res)
	              throws ServletException,IOException{
		String bname=req.getParameter("bname");
		String bcode=req.getParameter("bcode");
		String bqty=req.getParameter("bqty");
        String bprice=req.getParameter("bprice");

		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("***BookDetails***");
		pw.println("<br>BookName:"+bname);
		pw.println("<br>BookCode:"+bcode);
		pw.println("<br>BookQuantity:"+bqty);
        pw.println("<br>BookPrice:"+bprice);
		
	}
	public void destroy() {}
	public String getServletInfo() {
		return "FirstServlet";
	}
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}
}
