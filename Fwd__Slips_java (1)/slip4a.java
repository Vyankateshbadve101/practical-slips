import java.io.*;
import java.lang.*;
import java.sql.*;

class xyz
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	int rno=0;
	int i=0;

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
	public void delete()
	{
		try
		{
			sql="delete from studTable where name like 'A%'";
			stmt=con.createStatement();
			i=stmt.executeUpdate(sql);



			if(i>0)
			{
				System.out.print("data deleted ");
			}
			else
			{

				System.out.print("data not deleted ");
			}
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




					sql="select * from studTable";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql);

					if(rs.next())
					{
						System.out.print("\n Rollno \t name \t marks");
						do
						{
							System.out.print("\t"+rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));

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



class slip4a
{
	public static void main(String args[])
	{
		xyz x=new xyz();

		x.delete();
		x.display();
	}

}
