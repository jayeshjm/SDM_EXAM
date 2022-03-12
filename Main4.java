/* 2. Create a class Employee having member empId(int), empName(String),gender(char) 1.Write parameter less constructor and initialize your variables.
 2.Write display function which display the data. 
Also write TestMain class in the same file which will create the object of class Employee in it and call the display() Function.*/


class Employee
{
	int empId;
	String empName;
	char gender;
	
	Employee(int eI, String eN, char g)
	{
		System.out.println("inside Employee(eI,eN,g)...");
		empId=eI;
		empName=eN;
		gender=g;
	}
	Employee()
	{
	empName="Unknown";
	System.out.println("inside Employee()...");	
 	}
	Employee(int eI, String eN)
	{
	empId=eI;
	empName=eN;
	System.out.println("inside Employee(eI,eN)..");
	}
	void print()
	{
	System.out.println("Employee Id:" +empId +", Employee Name:"+empName +",Employee Gender:" +gender);
	}
};

public class Main4
{
	public static void main(String[] args)
	{
	Employee e;
	e=new Employee();
	e.print();
	
	Employee pooja=new Employee(2,"Pooja", 'F');
	pooja.print();
	Employee shyam=new Employee(4,"Shyam",'M');
	shyam.print();
	}

}