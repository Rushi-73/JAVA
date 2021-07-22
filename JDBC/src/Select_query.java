import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.FileInputStream;

class Select_query
{
	public static void main(String args[])throws Exception
	{

		Scanner sc=new Scanner(System.in);
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","2000");

		if(con==null)
		{
			System.out.println("Connection is ot established");

		}
		else
		{
			System.out.println("Connection Established");

			System.out.println("Enter Student Id:");
			int Roll=sc.nextInt();

			sc.nextLine();

			System.out.println("Enter Student Name:");
			String Name=sc.nextLine();

			System.out.println("Enter Admossion Date of Student:");
			String dob=sc.nextLine();

			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date ud=sdf.parse(dob);
			long ms=ud.getTime();
			java.sql.Date sd=new java.sql.Date(ms);

			System.out.println("Enter Path of Student Image:");
			String Imagepath=sc.nextLine();

			FileInputStream fis=new FileInputStream(Imagepath);

			String query1="INSERT INTO  studeimage3 VALUES(?,?,?,?)";

			PreparedStatement ps=con.prepareStatement(query1);
			ps.setInt(1,Roll);
			ps.setString(2,Name);
			ps.setDate(3,sd);
			ps.setBinaryStream(4,fis);

			int num=ps.executeUpdate();

			System.out.println("Number of rows Inserted="+num);




		}

	}
}