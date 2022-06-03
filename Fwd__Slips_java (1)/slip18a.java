import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;

public class slip18a extends Applet implements ActionListener,Runnable
{
	Thread t;
	int y=0;
	Button b1,b2;
	Boolean a=true;

	public void init()
	{
		t=new Thread (this);
	}
	public void start()
	{
		b1=new Button("Start Bouncing");
		b2=new Button("Stop bouncing");

		add(b1);
		add(b2);

		setSize(400,400);
		setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();

		if(ob==b1)
		{
			t.start();
		}
		else
		{
			if(ob==b2)
			{
				t.stop();
			}
		}
	}
	public void run()
	{
		try
		{
			while(true)
			{
				if(y<=500 && a==true)
				{
					y=y+10;
					repaint();
					t.sleep(1000);
					setBackground(Color.PINK);

					if(y==500)
					{
						a=false;
					}
				}
				else
				{
					if(y>=0 && a==false)
					{
						y=y-10;
						repaint();
						t.sleep(500);
						setBackground(Color.BLACK);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	public void paint(Graphics g)
	{
		Random r= new Random();
		int red=r.nextInt(250);
		int green=r.nextInt(250);
		int blue=r.nextInt(250);

		Color cl=new Color(red,green,blue);
		g.setColor(cl);

		g.fillOval(100,y,90,90);
	}
}