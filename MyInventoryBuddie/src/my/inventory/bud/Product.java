package my.inventory.bud;

public class Product {
	
	private String productName;
	private String skuNumber;
	private double price;
	private int quantity;

	public Product(String productName, String skuNumber, double price, int quantity)
	{
		this.productName = productName;
		this.skuNumber = skuNumber;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
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
	
	public void decreaseQuantity( int amount)
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
		System.out.println("Item name " + productName);
		System.out.println(" SKU Number " + skuNumber);
		System.out.println("Price " + price);
		System.out.println("Quantity " + quantity);
		System.out.println("Total Value: $" + calculateTotalValue());
		
	}
	
	
	
}
