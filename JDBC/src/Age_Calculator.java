import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.io.FileReader;
class Age_Calculator
{
	public static void main(String[] args)throws Exception {

		Scanner sc=new Scanner(System.in);
		
		Connection con=null;
  		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","2000");

  		 if(con==null)
  		 {
  		 	System.out.println("Connection does not established");
  		 }
  		 else
  		 {
         	 PreparedStatement ps=con.prepareStatement("INSERT INTO emp_info VALUES(?,?,?,?)");

        System.out.println("Please enter empid ,empname ,Date of joining of Employee to insert");
        int eid=sc.nextInt();
        String ename=sc.next();
        String str=sc.next();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date ud=sdf.parse(str);
				long ms=ud.getTime();
				java.sql.Date sd=new java.sql.Date(ms);
        System.out.println("Please enter path of text file");
        String text=sc.next();

        FileReader fr=new FileReader(text);

        ps.setInt(1,eid);
        ps.setString(2,ename);
        ps.setDate(3,sd);
        ps.setCharacterStream(4,fr);
		int count=ps.executeUpdate();
		if(count==0)
        {
          System.out.println("0 Number of rows are affected");
        }
        else
        {
          System.out.println(count+" Number of rows are affected");
        }

        PreparedStatement ps1=con.prepareStatement("select joindate from emp_info where empid=?");

        System.out.println("Please enter emp id to get join date");
        eid=sc.nextInt();
        ps1.setInt(1,eid);
        ResultSet rs=ps1.executeQuery();
        if(rs.next())
        {
        	ud=rs.getDate(1);
        	str=sdf.format(ud);
        	System.out.println(str);
        }
        else
        {
        	System.out.println("Not read");
        }
    }
		
	}
}