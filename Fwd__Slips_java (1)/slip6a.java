import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class slip6a extends Applet implements ActionListener,Runnable
{
	Thread t;
	Button b1,b2;

	public void init()
	{
		t=new Thread(this);
		b1=new Button("Start Blinking");
		b2=new Button("Stop Blinking");
	}
	public void start()
	{
		add(b1);


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
				b1.setVisible(true);
			    t.sleep(400);

			    b1.setVisible(false);
		     	t.sleep(400);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}