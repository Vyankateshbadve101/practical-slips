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
			for(i=1;i<=20;i++)
			{
				System.out.print("\n \t "+i);
				sleep(200);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
class slip1a
{
	public static void main(String args[])
	{
		xyz x=new xyz();
	}

}