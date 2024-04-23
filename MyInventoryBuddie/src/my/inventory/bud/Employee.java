package my.inventory.bud;

public class Employee 
{
	private String employeeName;
	private String employeeId;
	private String employeePassword;
	
	public Employee(String employeeName, String employeeId, String employeePassword )
	{
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeePassword = employeePassword;
		
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public String getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public String getEmployeePassword()
	{
		return employeePassword;
	}
	
	public void setEmployeePassword(String employeePassword)
	{
		this.employeePassword = employeePassword;
	}
}
