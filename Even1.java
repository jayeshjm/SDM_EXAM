//Write a Java program to add all even number from 1 to 10 and print it.

import java.util.Scanner;
public class Even1
{
public static void main(String[] args)
{

 	Scanner myObj = new Scanner(System.in); 
    	System.out.println("Enter number");

    	int number = myObj.nextInt(); 
   	System.out.println("Number is: " + number);

	int i=1,sum=0;
	for(i=1;i<=number;i++)
	{
	if(i%2==0)
	{
	sum=sum+i;
	}
	}
	System.out.println("Sum of even number is :" + sum);
}
}