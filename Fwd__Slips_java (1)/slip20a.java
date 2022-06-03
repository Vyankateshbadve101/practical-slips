import java.io.*;
import java.lang.*;
import java.sql.*;

class xyz
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	String nm;
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


	public void update()
		{

			try
			{

					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

					System.out.print("Enter  rollno:  ");
					rno=Integer.parseInt(br.readLine());

					System.out.print("Enter  name:  ");
					nm=(br.readLine());

					sql="update  studTable set name='"+nm+"',rollno="+rno+"";
					stmt=con.createStatement();
					i=stmt.executeUpdate(sql);

					if(i>0)
					{

							System.out.print("record updated");
					}
					else
					{

						System.out.print("record not updated");
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
			sql="select  from studTable";
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

class slip20a
{
	public static void main(String args[])
	{
		xyz x=new xyz();
		x.update();

		x.display();
	}

}
