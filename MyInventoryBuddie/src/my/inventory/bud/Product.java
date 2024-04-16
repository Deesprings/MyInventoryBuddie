package my.inventory.bud;

public class Product {
	
	private String itemName;
	private String skuNumber;
	private double price;
	private int quantity;

	public Product(String itemName, String skuNumber, double price, int quantity)
	{
		this.itemName = itemName;
		this.skuNumber = skuNumber;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getItemName()
	{
		return itemName;
	}
	
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	public String getSkuNumber()
	{
		return skuNumber;
	}
	
	public void setSkuNumber( String skuNumber)
	{
		this.skuNumber = skuNumber;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity( int quantity)
	{
		this.quantity = quantity;
	}
	
	public double calculateTotalValue()

	{
		return price * quantity;
	}
	
	public void increaseQuantity(int amount)
	{
		quantity += amount;
	}
	
	public void decreaseQuantitiy( int amount)
	{
		if (amount <= quantity)
		{
			quantity -= amount;
		}
		else
		{
			System.out.println("Error Insufficient quantity.");
		}
		
	}
	
	public void displayProduct()
	{
		System.out.println("Item name " + itemName);
		System.out.println(" SKU Number " + skuNumber);
		System.out.println("Price " + price);
		System.out.println("Quantity " + quantity);
		System.out.println("Total Value: $" + calculateTotalValue());
		
	}
	
	
	
}
