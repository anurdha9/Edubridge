package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/choice")
public class ChoiceServlet implements Servlet {
public void init(ServletConfig sc) throws ServletException{}
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
	String s1=req.getParameter("s1");
	if(s1.equals("add")) {
		RequestDispatcher rd=req.getRequestDispatcher("ad");
		rd.forward(req,res);
	}
	else {
		RequestDispatcher rd=req.getRequestDispatcher("sb");
		rd.forward(req,res);
	}
}
public void destroy() {}
public String getServletInfo() {
	return "FirstServlet";
	
}
public ServletConfig getServletCongif() {
	return this.getServletCongif();}
@Override
public ServletConfig getServletConfig() {
	// TODO Auto-generated method stub
	return null;
}
}

