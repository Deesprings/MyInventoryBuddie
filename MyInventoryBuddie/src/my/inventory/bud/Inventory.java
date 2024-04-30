package my.inventory.bud;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends Product
{
	private ArrayList<Product> inventory;
	
	public Inventory(ArrayList<Product> inventory)
	{
		super("","",0.0,0);
		this.inventory = inventory;
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
	
	public void setProducts(ArrayList<Product> inventory)
	{
		this.inventory = inventory;
	}
}


