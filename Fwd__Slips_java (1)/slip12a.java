import java.io.*;
import java.lang.*;
import java.sql.*;

class xyz
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	int cnt=0;

	public xyz()
	{

		try
		{


			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://stud.accdb");
		}
		catch(Exception e)
		{
			System.out.print("e");
		}
	}
	public void display()
	{
		try
		{
			sql="select * from stud";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);

			while(rs.next())
		   {
			   cnt++;
		   }

				System.out.print("number of records= "+cnt);

		}
		catch(Exception e)
		{
			System.out.print("e");
		}
	}


}

class slip12a
{
	public static void main(String args[])
	{
		xyz x=new xyz();

		x.display();
	}

}
