package my.inventory.bud;

public class Employee 
{
	private String employeeName;
	private String employeeId;
	
	public Employee(String employeeName, String employeeId)
	{
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		
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
}
