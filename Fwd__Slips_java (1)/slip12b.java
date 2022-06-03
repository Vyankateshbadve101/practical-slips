import java.io.*;
import java.lang.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class xyz extends Frame implements ActionListener,Runnable
{
	Pannel p;
	Button b1,b2;

	Label l1,l2;
	TextField t1,t2;


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


			p=new Pannel();
			b1=new Button("Insert");
			b2=new Button("clear");

			l1=new Label("enter rollno: ");
			l2=new Label("enter name: ");
			t1= new TextField(30);
			t2= new TextField(30);


			add(p);
			p.add(l1);
			p.add(t1);
			p.add(l2);
			p.add(t2);
			p.add(b1);
			p.add(b2);



			setSize(400,400);
			setVisible(true);

			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		catch(Exception e)
		{
			System.out.print("e");
		}

		public void actionPerformed(ActionEvent ae)
		{

			try
			{
				Object ob=ae.getSource();

				if(ob==b1)
				{


						rno=Integer.parseInt(t1.getText());
						nm=t2.getText();

						sql="insert into stud(rno,nm) values ('rno','nm')";
						stmt=con.createStatement();
						i=stmt.executeUpdate(sql);

						if(rs.next())
						{
							System.out.print("\n rollno \t name \t marks ");
							do
							{
								System.out.print("\t"+rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));


							}while(rs.next());
						}

				}
				else
				{

					if(ob==b2)
					{
							t1.setText("");
							t1.requestFocus();


							t2.setText("");
							t2.requestFocus();

					}

				}

			}
			catch(Exception e)
			{
				System.out.print("e");

			}
		}
	}


}

class slip20a
{
	public static void main(String args[])
	{
		xyz x=new xyz();

	}

}
