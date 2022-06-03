
import java.io.*;
import java.lang.*;

class xyz extends Thread
{

	int startno=0;
	int endno=0;
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
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("enter  start no: ");
			startno=Integer.parseInt(br.readLine());

			System.out.print("enter  end no: ");
			endno=Integer.parseInt(br.readLine());


			for(i=startno;i<=endno;i++)
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

class slip3a
{

	public static void main(String args[])
	{

		xyz x=new xyz();
	}

}