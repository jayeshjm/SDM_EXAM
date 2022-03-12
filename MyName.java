import java.util.Scanner;

public class MyName
{
	
	public static void main(String args[])
	{
		String name = "";
		System.out.print("Enter your name : ");

		Scanner sc = new Scanner(System.in);
		name = sc.next();

		name = name.toUpperCase();
		
		if( name.equals("AARTI") )
		{
			System.out.println("Your name is : " + name);
		}
			
	}	

}
