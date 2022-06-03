import java.io.*;
import java.lang.*;

class xyz extends Thread
{
	int no,i,arm,rem;

	public xyz()
	{
		super();
		start();
	}
	public void run()
	{
		try
		{
			for(i=1;i<=1000;i++)
			{
				no=i;
				while(no>0)
				{
					rem=no%10;
					arm=arm+(rem*rem*rem);
					no=no/10;
				}
				if(arm==i)
				{
					System.out.println("ARMSTRONG NUMBER "+arm);
					sleep(200);
				}
					arm=0;
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
class slip7a
{
	public static void main(String args[])
	{
		xyz x=new xyz();
	}
}