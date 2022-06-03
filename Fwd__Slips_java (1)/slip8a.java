import java.io.*;
import java.lang.*;
import java.sql.*;

class xyz
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;

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
			sql="select * from empTable where ename like 's%'";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);

			if(rs.next())
			{
				System.out.print("\n Rollno \t name ");
				do
				{
					System.out.print("\t"+rs.getInt("rollno")+"\t"+rs.getString("name"));

				}while(rs.next());
			}
			else
			{
				System.out.print("data does not  found");
			}
		}
		catch(Exception e)
		{
			System.out.print("e");
		}
	}


}

class slip6b
{
	public static void main(String args[])
	{
		xyz x=new xyz();

		x.display();
	}

}
