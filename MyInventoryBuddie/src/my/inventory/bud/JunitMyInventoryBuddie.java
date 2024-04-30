package my.inventory.bud;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JunitMyInventoryBuddie {

	@Test
	void testGetProductInfo()
	{
		Product product1 = new Product("Bacon", "SKU11123" , 9.99 , 5);
		assertEquals("Bacon", product1.getProductName());
		assertEquals("SKU11123", product1.getSkuNumber());
		assertEquals(9.99, product1.getPrice());
		assertEquals(5, product1.getQuantity());
	}
	
	@Test
	void testCalculateTotalValue()
	{
		Product product1 = new Product("Bacon", "SKU11123" , 9.99 , 5);
		assertEquals(49.95, product1.calculateTotalValue());
	}
	
	@Test
	void testIncreaseQuantity()
	{
		Product product1 = new Product("Bacon", "SKU11123" , 9.99 , 5);
		product1.increaseQuantity(2);
		assertEquals(7, product1.getQuantity());
	}
	
	@Test
	void testDecreaseQuantity()
	{
		Product product1 = new Product("Bacon", "SKU11123" , 9.99 , 5);
		product1.decreaseQuantity(2);
		assertEquals(3, product1.getQuantity());
	}
	
	@Test
	void testCalculateTotalInventoryValue()
	{
		ArrayList <Product> coffeeProducts = new ArrayList<>();
		coffeeProducts.add(new Product("Coffee Grounds", "SKU1123", 5.00, 10));
		coffeeProducts.add(new Product("Coffee Cups", "SKU1124", 1.00, 20));
		coffeeProducts.add(new Product("Coffee Lids", "SKU1125", 0.50, 20));
		 Inventory inventory = new Inventory(coffeeProducts);
		assertEquals(80.0, inventory.calculateTotalInventoryValue());
	}
	
	@Test
	void testAddProduct() 
	{
		ArrayList <Product> breakfastItems = new ArrayList<>();
		Inventory inventory = new Inventory(breakfastItems);
		Product product1 = new Product("Bacon", "SKU11123" , 9.99 , 5);
		
		inventory.addProduct(product1);
		
		assertEquals("Bacon" ,product1.getProductName());
	}
	
	@Test
	void testRemoveProduct()
	{
		ArrayList <Product> breakfastItems = new ArrayList<>();
		Inventory inventory = new Inventory(breakfastItems);
		Product product1 = new Product("Bacon", "SKU11123" , 9.99 , 5);
		
		inventory.removeProduct(product1);
	}
	
	@Test
	void testGetEmployeeInfo()
	{
		Employee employee1 = new Employee("Jason", "US12112", "Baconbits123");
		assertEquals("Jason" , employee1.getEmployeeName());
		assertEquals("US12112" , employee1.getEmployeeId());
		assertEquals("Baconbits123" , employee1.getEmployeePassword());
	}
}
