//Write a program for performing DML and DDL statements
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
  class DMLDDL
  {
  	public static void main(String[] args)throws Exception {
  		
  		//class.forName("com.mysql.cj.jdbc.Driver");
  		Connection con=null;
  		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","2000");

  		 if(con==null)
  		 {
  		 	System.out.println("Connection does not established");
  		 }
  		 else
  		 {
         Scanner sc=new Scanner(System.in);
         
       /* ResultSet rs;
  		 	PreparedStatement ps=con.prepareStatement("select * from stud_info");
  		 	 rs=ps.executeQuery();
  		 	
  		 	while(rs.next())
  		 	{
  		 		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
  		 	}

        PreparedStatement ps1=con.prepareStatement("select * from stud_info where rollno= ?");
       
        
        System.out.println("Enter rollno for select record");
        int roll=sc.nextInt();
        ps1.setInt(1,roll);
        rs=ps1.executeQuery();
        rs.next();
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        PreparedStatement ps2=con.prepareStatement("update stud_info set name='ani',address='pun' where rollno=?");

        System.out.println("Please enter rollno to update name and address of student");
        roll=sc.nextInt();
        ps2.setInt(1,roll);
        ps2.executeUpdate();
        rs=ps.executeQuery();
        while(rs.next())
        {
          System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        PreparedStatement ps3=con.prepareStatement("INSERT INTO stud_info VALUES(?,?,?)");

        System.out.println("Please enter rollno ,name ,address of student to insert");
        roll=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        ps3.setInt(1,roll);
        ps3.setString(2,name);
        ps3.setString(3,address);
        int count=0;
        count=ps3.executeUpdate();
        if(count==0)
        {
          System.out.println("0 Number of rows are affected");
        }
        else
        {
          System.out.println(count+" Number of rows are affected");
        }

        PreparedStatement ps4=con.prepareStatement("delete from stud_info where rollno=?");
        System.out.println("Please enter the rollno to delete record");
        roll=sc.nextInt();
        ps4.setInt(1,roll);
        count=ps4.executeUpdate();
         if(count==0)
        {
          System.out.println("0 Number of rows are affected");
        }
        else
        {
          System.out.println(count+" Number of rows are affected");
        }
       */
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","2000");
        PreparedStatement ps5=con.prepareStatement("CREATE DATABASE ?");
        System.out.println("Please enter the database name");
         String dbname=sc.nextLine();
         ps5.setString(1,dbname);
         ps5.executeUpdate();
        
         
        /*con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname+"","root","2000");
        System.out.println("Please enter the query to create table ");
        String tname=sc.next();
        PreparedStatement ps6=con.prepareStatement(tname);
        ps6.executeUpdate();*/
        /*String q3="create table "+tname+"(empid int,empname varchar(20))";
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
  }