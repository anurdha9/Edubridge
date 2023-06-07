package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/choice")
public class Options implements Servlet {
public void init(ServletConfig sc) throws ServletException{}
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
	String s1=req.getParameter("s1");
	if(s1.equals("Mul")) {
		RequestDispatcher rd=req.getRequestDispatcher("Mul");
		rd.forward(req,res);
	}
	else if(s1.equals("Div")) {
		RequestDispatcher rd=req.getRequestDispatcher("Div");
		rd.forward(req,res);
	}
	else if(s1.equals("Moddiv")){
		RequestDispatcher rd=req.getRequestDispatcher("Moddiv");
		rd.forward(req,res);
	}
	else if(s1.equals("Greater")){
		RequestDispatcher rd=req.getRequestDispatcher("Greater");
		rd.forward(req,res);
	}else{
		RequestDispatcher rd=req.getRequestDispatcher("Smaller");
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
