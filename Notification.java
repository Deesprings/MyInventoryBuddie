package my.inventory.bud;

public class Notification extends Inventory
{
	private int lowStockThreshold;
	private int restockThreshold;
	
	public Notification(String itemName , String skuNumber , double price, int quantity, int lowStockThreshold , int restockThreshold)
	{
		super(itemName, skuNumber, price, quantity);
		this.lowStockThreshold = lowStockThreshold;
		this.restockThreshold = restockThreshold;
	}
	
	public void lowStockAlert()
	{
		if(getQuantity() < lowStockThreshold)
		{
			System.out.println("Low stock alert for item: " + getItemName());
			System.out.println("Current stock level: " + getQuantity());
		}
		
	}
	
	public void reStockAlert()
	{
		if(getQuantity() == 0)
		{
			System.out.println("Restock alert for item: " + getItemName());
			System.out.println ("Current stock level: " + getQuantity());
		}
		else if(getQuantity() < restockThreshold)
		{
			System.out.println("Restock alert for item: " + getItemName());
			System.out.println("Current stock level: " + getQuantity());
		}
	}
}
