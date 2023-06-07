package jan19;
import java.sql.*;
import java.util.*;
public class DBCon8 {
public static void main(String[] args) {
try {
	Pooling ob=new Pooling("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	ob.createConnection();
	System.out.println("size of pool:"+ob.v.size());
	System.out.println("****user 1****");
	Connection con=ob.useConnection();
	System.out.println(con);
	System.out.println("size of pool:"+ob.v.size());
	System.out.println("****user 2****");
	Connection con2=ob.useConnection();
	System.out.println(con2);
	System.out.println("size of pool:"+ob.v.size());
	System.out.println("****user 1****");
	ob.returnConnection(con);
	System.out.println("size of pool:"+ob.v.size());
	System.out.println("****user 2****");
	ob.returnConnection(con2);
    System.out.println("size of pool:"+ob.v.size());
    System.out.println("Display Connection from pool");
    Iterator<Connection> it=ob.v.iterator();
    while(it.hasNext()) {
    System.out.println(it.next());	
    }
    }catch(Exception e){e.printStackTrace();}
    }
	}