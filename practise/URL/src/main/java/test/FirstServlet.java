package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	BookBean bb = new RetrieveBookDAO().retrieve(req);
	if(bb==null) {
	pw.println("Invalid BookCode...<br>");
	RequestDispatcher rd = req.getRequestDispatcher("input.html");
	rd.include(req, res);
	}else {
	pw.println("Valid bookCode...<br>");
	pw.println("<a href='second?code="+bb.getCode()
	+"&name="+bb.getName()
	+"&author="+bb.getAuthor()
	+"&price="+bb.getPrice()
	+"&qty="+bb.getQty()+"'>ViewDetails</a>");
	}
	}
}
