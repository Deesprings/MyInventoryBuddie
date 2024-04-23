package my.inventory.bud;

import java.util.Scanner;

public class Main  {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee("Mike Michealson" , "MikeM123" , " password");
		
		String inputUsername;
		String inputPassword;
		
		try
		{
		System.out.print("Enter username: ");
	    inputUsername = scanner.nextLine();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid input ");
		}
		System.out.print("Enter Password");
		inputPassword = scanner.nextLine();
		
		if(inputUsername.equals(employee.getEmployeeId()) && inputPassword.equals(employee.getEmployeePassword()))
		{
			System.out.println("Login successful. Welcome, "  + employee.getEmployeeName());
			
		}
		else
		{
			System.out.println("Invald username or password. Please try again!");
		}
		
		
		scanner.close();

	}

}
