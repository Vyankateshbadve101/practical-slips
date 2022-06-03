
import java.io.*;
import java.lang.*;

class xyz extends Thread
{

	char i;

	public xyz()
	{

		super();
		start();

	}
	public void run()
	{

		try
		{


			for(i='a';i<='z';i++)
			{

				{
					System.out.print("\n \t"+i);
					sleep(300);
				}

			}
		}
		catch(Exception e)

		{
			System.out.print("e");
		}

	}


}

class slip15a
{

	public static void main(String args[])
	{

		xyz x=new xyz();
	}

}