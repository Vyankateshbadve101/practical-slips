/*
car
*/

import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class slip9b extends Applet implements ActionListener,Runnable
{
	Thread t;
	Button b1,b2;
	int x=0;
	Label l1,l2;


	public void init()
	{
		t=new Thread(this);

		l1=new Label("Car1");
		l2=new Label("Car2");

		b1=new Button("Start");
		b2=new Button("Stop");
	}
	public void start()
	{


		add(b1);
		add(b2);

		add(l1);
		add(l2);

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
			t.stop();
		}
	}

	public void run()
	{
		try
		{
			while(true)
			{
				x=x+10;
				l1.setBounds(x,100,90,90);
				l2.setBounds(x,200,90,90);

				t.sleep(100);

				if(x==400)
				{
					x=0;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}