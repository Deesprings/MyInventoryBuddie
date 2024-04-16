package my.inventory.bud;

import java.util.ArrayList;
import java.util.List;

public class Suppliers extends Product
{
	private String suppliersName;
	private List<Suppliers> suppliers;
	
	public Suppliers (String itemName, String skuNumber, double price, int quantity, String suppliersName)
	{
		super(itemName, skuNumber, price , quantity);
		this.suppliersName = suppliersName;
		suppliers = new ArrayList<>();
	}
	
	public void addSupplier(Suppliers supplier)
	{
		suppliers.add(supplier);
	}
	
	public void removeSupplier(Suppliers supplier)
	{
		suppliers.remove(supplier);
	}
	
	public String getSuppliersName()
	{
		return suppliersName;
	}
	
	public void setSuppliersName(String suppliersName)
	{
		this.suppliersName = suppliersName;
	}
	
	public List<Suppliers> getSuppliers()
	{
		return suppliers;
	}
	
	public void setSuppliers(List<Suppliers> suppliers)
	{
		this.suppliers = suppliers;
	}
}


