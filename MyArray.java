import java.util.Scanner;  
public class MyArray
{
	public static void main(String[] args)
	{
	int [] arr=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter"+arr.length+"numbers");
	
	for(int i=0;i<arr.length;i++)
	{

		arr[i]=sc.nextInt();

	}
	print_array(arr);
	}
static void print_array(int[]brr)
{
	for(int i=0;i<brr.length;i++)
	{
	  System.out.println("brr["+i+"]: " + brr[i]);
	}


}

}