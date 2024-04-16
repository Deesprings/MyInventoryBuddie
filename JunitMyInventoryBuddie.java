package my.inventory.bud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitMyInventoryBuddie {

	@Test
	void testAddProduct() 
	{
		Inventory inventory = new Inventory(null, null, 0, 0);
		Product product1 = new Product("Bacon", "SKU11123" , 9.99 , 5);
		
		inventory.addProduct(product1);
		
		assertEquals("Bacon" ,product1.getItemName());
	}
	
	@Test
	void testGetEmployeeName()
	{
		Employee employee1 = new Employee("Jason", "US12112");
		assertEquals("Jason" , employee1.getEmployeeName());
	}
}
