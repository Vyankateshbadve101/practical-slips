import java.io.*;
import java.lang.*;


class xyz extends Thread
{
	int i=0;

	public xyz()
	{
		super();
		start();
	}
	public void run()
	{
		try
		{
			for(i=0;i<20;i++)
			{
				System.out.print("\n HELLO WORD\t ");
				sleep(200);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
class slip11a
{
	public static void main(String args[])
	{
		xyz x=new xyz();
	}

}