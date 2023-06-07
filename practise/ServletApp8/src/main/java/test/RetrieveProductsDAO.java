package test;
import java.sql.*;
import java.util.*;

public class RetrieveProductsDAO {
public ArrayList<ProductBean> al=new ArrayList<ProductBean>();
public ArrayList<ProductBean> retrieve()
{
	try {
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("select * from Product50");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		ProductBean pb=new ProductBean();
		pb.setCode(rs.getString(1));
		pb.setName(rs.getString(2));
		pb.setPrice(rs.getFloat(3));
		pb.setQty(rs.getInt(4));

		}
		
}catch(Exception e) {e.printStackTrace();}
	return al;
}
}