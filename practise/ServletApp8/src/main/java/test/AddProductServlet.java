package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends GenericServlet{
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	ProductBean pb=new ProductBean();
	pb.setCode(req.getParameter("code"));
	pb.setName(req.getParameter("name"));
	pb.setPrice(Float.parseFloat(req.getParameter("price")));
	pb.setQty(Integer.parseInt(req.getParameter("qty")));
    int k=new InsertProductDAO().insert(pb);
    if(k>0) {
	pw.println("product added successfully.....");
	RequestDispatcher rd=req.getRequestDispatcher("link.html");
	rd.include(req,res);
            }
	}

}
