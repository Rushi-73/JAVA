//write a program for Authenticating User's username and password 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class Authentication
{
	public static void main(String[] args)throws Exception {
		
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","2000");

		if(con==null)
		{
			System.out.println("Connection failed");
		}
		else
		{
			PreparedStatement ps=con.prepareStatement("select count(*) from userinfo where uname=? and pword=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter Username");
			String usern=sc.next();
			System.out.println("Please enter Password");
			String password=sc.next();
			ps.setString(1,usern);
			ps.setString(2,password);

			ResultSet rs=ps.executeQuery();
			rs.next();
			int cnt=rs.getInt(1);
			if(cnt==0)
			{
				System.out.println("No record Found");
			}
			else
			{
				System.out.println("record found");
			}

		}
	}
}