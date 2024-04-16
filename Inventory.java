package my.inventory.bud;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends Product
{
	private List<Product> inventory;
	
	public Inventory(String itemName, String skuNumber , double price , int quantity)
	{
		super(itemName, skuNumber, price, quantity);
		inventory = new ArrayList<>();
	}
	
	public void addProduct(Product product)
	{
		inventory.add(product);
	}
	
	public void removeProduct(Product product)
	{
		inventory.remove(product);
	}
	
	public double calculateTotalInventoryValue()
	{
		double totalValue = 0.0;
		for(int i =0; i< inventory.size(); i++)
		{
			Product product = inventory.get(i);
			totalValue += product.calculateTotalValue();
		}
		return totalValue;
	}

	
	public List<Product> getProducts()
	{
		return inventory;
	}
	
	public void setProducts(List<Product> products)
	{
		this.inventory = products;
	}
}


