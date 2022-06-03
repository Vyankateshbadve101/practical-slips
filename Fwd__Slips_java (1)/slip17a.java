

import java.io.*;
import java.lang.*;

class xyz extends Thread
{

	String str;
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

			System.out.print("enter a string: ");
			str=br.readLine();

			for(i=0;i<=str.length();i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')

				{
					System.out.print("\n \tVowel charect are: "+str.charAt(i));
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

class slip17a
{

	public static void main(String args[])
	{

		xyz x=new xyz();
	}

}