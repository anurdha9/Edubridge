package servletApp5;
	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.annotation.*;
	@WebServlet("/five")
	    public class FifthServlet implements Servlet{
		public void init(ServletConfig sc)throws ServletException { }
		public void service(ServletRequest req,ServletResponse res)
		              throws ServletException,IOException{
			String bname=req.getParameter("bname");
			String bcode=req.getParameter("bcode");
			String bprice=req.getParameter("bprice");
	        String bqty=req.getParameter("bqty");

			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("***Registration***");
			pw.println("<br>BookName:"+bname);
			pw.println("<br>BookCode:"+bcode);
			pw.println("<br>BookPrice:"+bprice);
	        pw.println("<br>BookQuantity:"+bqty);
			
		}
		public void destroy() {}
		public String getServletInfo() {
			return "FirstServlet";
		}
		public ServletConfig getServletConfig() {
			return this.getServletConfig();
		}
	}


