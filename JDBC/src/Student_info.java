import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

class Student_info
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

        ResultSet rs=null;
        SimpleDateFormat sdf=null;
        java.sql.Date sd=null;
         FileInputStream fis=null;
         Connection con=null;
         PreparedStatement ps=null;
         PreparedStatement ps1=null;

		//getting input from user
     System.out.println("Please enter rollno");
        int rollno=sc.nextInt();
        System.out.println("Please enter student name");
        String sname=sc.next();
        System.out.println("Please enter student address");
        String adr=sc.next();
        System.out.println("Please enter DOB");
        String dob=sc.next();
        System.out.println("Please enter path of student image");
        String img_path=sc.next();
        try
        {
            //simpledateformat class is used to convert given string in specific format
            sdf=new SimpleDateFormat("dd-MM-yyyy");
            if(sdf==null)
            {
               throw new NullPointerException();
            }
            else
            {
               java.util.Date ud=sdf.parse(dob);
               long ms=ud.getTime();
              
            
            sd=new java.sql.Date(ms);
        
            
             fis=new FileInputStream(img_path);
         
		
		    
  		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","2000");

  		 if(con==null)
  		 {
  		 	throw new NullPointerException();
  		 }
  		 else
  		 {
         	 
         
         ps=con.prepareStatement("INSERT INTO student_info VALUES(?,?,?,?,?)");
         if(ps==null)
            throw new NullPointerException();
         else
         {
          ps.setInt(1,rollno);
          ps.setString(2,sname);
          ps.setString(3,adr);
          if(sd==null)
            throw new NullPointerException();
         else
          ps.setDate(4,sd);
         if(fis==null)
            throw new NullPointerException();
         else
          ps.setBinaryStream(5,fis);

	       	int count=ps.executeUpdate();
	       	if(count==0)
          {
             System.out.println("0 Number of rows are affected");
          }
          else
          {
             System.out.println(count+" Number of rows are affected");
          }
       }
          
         try
         {
             ps1=con.prepareStatement("select * from student_info where rollno=?");
          }catch(SQLException e)
          {
            e.printStackTrace();
          }

        System.out.println("Please enter emp id to get join date");
        
        rollno=sc.nextInt();
        try
        {
         ps1.setInt(1,rollno);
      }catch(SQLException e)
      {
         e.printStackTrace();
      }
        rs=ps1.executeQuery();
        if(rs==null)
         throw new NullPointerException();
       else
       {
        if(rs.next())
        {
         try
         {
          System.out.println("Roll no is:"+rs.getInt(1));
          System.out.println("Name :"+rs.getString(2));
          System.out.println("Address :"+rs.getString(3));
        	ud=rs.getDate(4);
        	dob=sdf.format(ud);
        	System.out.println("Date of birth is"+dob);
          InputStream is=rs.getBinaryStream(5);
          FileOutputStream fos=new FileOutputStream("Image.jpg");

          IOUtils.copy(is,fos);
          System.out.println("Image copying is done");
       }catch(SQLException e)
       {
         e.printStackTrace();
       }
       finally
       {
         rs.close();
       }

        }
        else
        {
        	System.out.println("Not read");
        }
     }

      }
   }
	  }
     catch(Exception ex)
     {
      System.out.println(ex.toString());
     }
     finally
     {
      fis.close();
      con.close();
      ps.close();
      ps1.close();

     }	
	}
}
