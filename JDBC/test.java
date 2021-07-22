import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;

class test
{
	public static void main(String[] args)throws Exception {
		
		/*Driver obj=new Driver();

		DriverManager.registerDriver(obj);*/

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=null;

		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/matchsb","root","2000");

		if(con==null)
			System.out.println("Connection is not established");
		else
			System.out.println("Connection is established");
	}
}