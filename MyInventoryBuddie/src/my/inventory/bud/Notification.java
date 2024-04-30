package my.inventory.bud;

public class Notification extends Product
{
	private int lowStockThreshold;
	private int restockThreshold;
	
	public Notification(int lowStockThreshold , int restockThreshold)
	{
		super(" "," ",0.0,0);
		this.lowStockThreshold = lowStockThreshold;
		this.restockThreshold = restockThreshold;
	}
	
	public void lowStockAlert()
	{
		if(getQuantity() < lowStockThreshold)
		{
			System.out.println("Low stock alert for item: " + getProductName());
			System.out.println("Current stock level: " + getQuantity());
		}
		
	}
	
	public void reStockAlert()
	{
		if(getQuantity() == 0)
		{
			System.out.println("Restock alert for item: " + getProductName());
			System.out.println ("Current stock level: " + getQuantity());
		}
		else if(getQuantity() < restockThreshold)
		{
			System.out.println("Restock alert for item: " + getProductName());
			System.out.println("Current stock level: " + getQuantity());
			System.out.println("Shut up bitch");
		}
	}
}
