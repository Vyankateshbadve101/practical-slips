import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class slip7b extends Applet implements ActionListener,Runnable
{
	Thread t;
	TextField tf;
	Button b1;
	int i=0;

	public void init()
	{
		t=new Thread(this);
		tf=new TextField(30);
		b1=new Button("Start");
	}
	public void start()
	{
		add(tf);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob = ae.getSource();

		if(ob==b1)
		{
			t.start();
		}
	}
	public void run()
	{
		try
		{
			for(i=0;i<=100;i++)
			{
				tf.setText(""+i);
				t.sleep(200);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}