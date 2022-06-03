import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class slip20b extends Applet implements ActionListener,Runnable
{
	Thread t;
	Button b1,b2;
	Boolean red,green,yellow;

	public void init()
	{
		t=new Thread(this);
		b1=new Button("Start Signal");
		b2=new Button("Stop signal");

		add(b1);
		add(b2);

		setSize(400,400);
		setVisible(true);

		red=true;

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
				if(red==true)
				{
					red=false;
					green=true;
					yellow=false;
				}
				else
				{
					if(green==true)
					{
						yellow=true;
						red=false;
						green=false;
					}
					else
					{
						if(yellow==true)
						{
							red=true;
							yellow=true;
							green=true;
						}
					}
				}
				repaint();
				t.sleep(700);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void paint(Graphics g)
	{
		if(red==true)
		{
			g.setColor(Color.RED);
			g.fillOval(100,100,90,90);

		}
		else
		{
			if(yellow==true)
			{
				g.setColor(Color.YELLOW);
				g.fillOval(100,200,90,90);
			}
			else
			{
				if(green==true)
				{
					g.setColor(Color.GREEN);
					g.fillOval(100,300,90,90);
				}
			}
		}
	}
}