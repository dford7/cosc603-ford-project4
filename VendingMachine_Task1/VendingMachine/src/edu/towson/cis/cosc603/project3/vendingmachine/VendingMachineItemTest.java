package edu.towson.cis.cosc603.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	
	VendingMachineItem item;
	
	@Before
	public void setUp() throws Exception {		
		item = new VendingMachineItem("name", 50.0);
	}

	@After
	public void tearDown() throws Exception {		
		item = null;
	}

	@Test
	public void testGetName() {
		assertEquals("name", item.getName());
	}
	
	@Test
	public void testGetPrice() {
		assertEquals(50.0, item.getPrice(), 0.0);		
	}
	
	@Test (expected = VendingMachineException.class)
	public void testVendingMachineItem() {
		VendingMachineItem v = new VendingMachineItem("name", -2.0){
			
		};
	}
	
}
