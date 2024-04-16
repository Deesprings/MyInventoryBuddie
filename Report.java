package my.inventory.bud;

import java.util.List;

public class Report extends Inventory
{
	private String[] dates;
	private int[] quantitiesSold;
	
	
	public Report(String itemName , String skuNumber, double price , int quantity ,int[] quantitiesSold, String[]dates)
	{
		super(itemName, skuNumber, price, quantity);
		this.dates = dates;
		this.quantitiesSold = quantitiesSold;
	}
	
	public void generateSalesReport()
	{
		System.out.println( "Sales Report:");
		for(int i = 0; i< dates.length; i++)
		{
			System.out.println("Date: " + dates[i] + ", Quantity Sold: " + quantitiesSold[i]);
		}
	}
	
	public void getIventoryReport()
	{
		List<Product> products = getProducts();
		for (int i =0; i < products.size(); i++)
		{
			System.out.print("Inventory Report:");
			System.out.print("Item Name: " + getItemName());
			System.out.print("Sku Name: " + getSkuNumber());
			System.out.print("Price: " + getPrice());
			System.out.print( "Quantity: " + getQuantity());
		}
	}
}
