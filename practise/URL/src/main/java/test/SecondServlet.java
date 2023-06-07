package test;
	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.*;
	@SuppressWarnings("serial")
	@WebServlet("/second")
	public class SecondServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	pw.println("Code:"+req.getParameter("code"));
	pw.println("<br>Name:"+req.getParameter("name"));
	pw.println("<br>Author:"+req.getParameter("author"));
	pw.println("<br>Price:"+req.getParameter("price"));
	pw.println("<br>Qty:"+req.getParameter("qty"));
	RequestDispatcher rd = req.getRequestDispatcher("input.html");
	rd.include(req, res);
}
}