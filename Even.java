//5. Write a Java program to enter a number and print whether it is even or odd.

import java.util.Scanner;
public class Even
{
public static void main(String[] args)
{
Scanner myObj=new Scanner(System.in);
System.out.println("enter a number:");
int a=myObj.nextInt();
System.out.println("number:"+a);

if(a%2==0)
{
System.out.println("the number is even");
}
else
{
System.out.println("the number is odd");
}
}

}