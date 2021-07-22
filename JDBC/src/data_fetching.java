//Write a program for performing DML and DDL statements
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
  class data_fetching
  {
  	public static void main(String[] args)throws Exception {
  		
  		//class.forName("com.mysql.cj.jdbc.Driver");
  
      Statement st=null;
       ResultSet rs=null;
         
  		 try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","2000");
        Scanner sc=new Scanner(System.in);)
       {
         
  		 if(con==null)
  		 {
  		 	 throw new NullPointerException();
  		 }
  		 else
  		 {
  		 	 st=con.createStatement();
  		 	String q="select * from stud_info";
  		 	 rs=st.executeQuery(q);
  		 	
  		 	while(rs.next())
  		 	{
  		 		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
  		 	}

      
        
        System.out.println("Enter rollno for select record");
        String roll=sc.next();
        String str3="select * from stud_info where rollno='"+roll+"'";
        rs=st.executeQuery(str3);
        rs.next();
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        System.out.println("Please enter rollno to update name and address of student");
        roll=sc.next();
        String str="update stud_info set name='ani',address='pun' where rollno='"+roll+"'";
        st.executeUpdate(str);
        rs=st.executeQuery(q);
        while(rs.next())
        {
          System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
         System.out.println("Please enter rollno ,name ,address of student to insert");
        roll=sc.next();
        String name=sc.next();
        String address=sc.next();
        String str1="INSERT INTO stud_info VALUES('"+roll+"','"+name+"','"+address+"')";

      
        int count=0;
        count=st.executeUpdate(str1);
        if(count==0)
        {
          System.out.println("0 Number of rows are affected");
        }
        else
        {
          System.out.println(count+" Number of rows are affected");
        }
        System.out.println("Please enter the rollno to delete record");
        roll=sc.next();
        String str4="delete from stud_info where rollno='"+roll+"'";
        count=st.executeUpdate(str4);
         if(count==0)
        {
          System.out.println("0 Number of rows are affected");
        }
        else
        {
          System.out.println(count+" Number of rows are affected");
        }
       
       /* con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","2000");
        st=con.createStatement();
        System.out.println("Please enter the database name");
         String dbname=sc.next();
        String q1="create database "+dbname+"";
         count=st.executeUpdate(q1);
        if(count==0)
        {
          System.out.println("0 Number of rows are affected");
        }
        else
        {
          System.out.println(count+" Number of rows are affected");
        }
         
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname+"","root","2000");
        st=con.createStatement();
        System.out.println("Please enter the table name");
        String tname=sc.next();
        String q3="create table "+tname+"(empid int,empname varchar(20))";
        st.executeUpdate(q3);
        System.out.println("please enter the column name you want to add in "+tname+"to alter");
        String colname=sc.next();
        String q4="alter table "+tname+" add "+colname+" varchar(20)";
        count=st.executeUpdate(q4);
        if(count==0)
        {
          System.out.println("0 Number of rows are affected");
        }
        else
        {
          System.out.println(count+" Number of rows are affected");
        }
        System.out.println("please enter the table name to drop table");
         tname=sc.next();
         q3="drop table "+tname+"";
        st.executeUpdate(q3);

        System.out.println("Please enter the database name to drop");
         dbname=sc.next();
         String q2="drop database "+dbname+";";
          st.executeUpdate(q2);*/
  		 }
  	}
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }
  }