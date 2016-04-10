package edu.towson.cis.cosc603.project3.vendingmachine;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	// out test machine	
	VendingMachine machine;
	// items for testing
	VendingMachineItem [] items;
	// number of item in the test
	int itemNum = 4;
	// code for insertion 
	String [] codes = {VendingMachine.A_CODE, VendingMachine.B_CODE,
						VendingMachine.C_CODE,VendingMachine.D_CODE};

	/**
	 * set up all needed items and the machine
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		machine = new VendingMachine();
		items = new VendingMachineItem[itemNum];
		for (int i = 0; i < items.length; i++) {
			items[i] = new VendingMachineItem("name" + i, (i + 1) * 10.0);
		}	
	}

	/**
	 * clean machine and all items
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		machine = null;
		for (int i = 0; i < items.length; i++) {
			items[i] = null;
		}
	}

/*	@Test
	public void testGetSlotIndex() throws NoSuchMethodException, 
						SecurityException, IllegalAccessException, 
						IllegalArgumentException, InvocationTargetException {	
		Method method = 
				VendingMachine.class.getDeclaredMethod("getSlotIndex", 
				String.class);
		
		method.setAccessible(true);
		for (int i = 0; i < codes.length; i++) {
			
			assertEquals(i, (int) method.invoke(machine, codes[i]));
		}
	}
	*/
	
	@Test (expected = InvocationTargetException.class)
	public void testGetSlotIndex() throws NoSuchMethodException, 
						SecurityException, IllegalAccessException, 
						IllegalArgumentException, InvocationTargetException {	
		Method method = 
				VendingMachine.class.getDeclaredMethod("getSlotIndex", 
				String.class);
		
		method.setAccessible(true);		
			
		method.invoke(machine, "bad case");
		
	}
	
	
	
	/**
	 * Test addItem method
	 */
	@Test 
	public void testAddItem() {	
		VendingMachineItem item;
		for (int i = 0; i < codes.length; i++) {
			// put item into machine
			machine.addItem(items[i], codes[i]);
			// get it out
			item = machine.getItem(codes[i]);
			// test its correctness
			assertSame(items[i], item);
		}			
	}
	
	@Test (expected = VendingMachineException.class)
	public void testAddItemException(){		
		for (int i = 0; i < codes.length; i++) {
			// put item into machine
			machine.addItem(items[i], codes[i]);			
		}	
		// add a item to catch exception
		machine.addItem(items[0], codes[0]);
	}
	
	/**
	 * push all item into the machine
	 */
	private void addItemToMachine(){
		for (int i = 0; i < codes.length; i++) {
			machine.addItem(items[i], codes[i]);
		}
	}
	
	/**
	 * Test removeItem method
	 */
	@Test
	public void testRemoveItem(){
		// add all items
		addItemToMachine();
		// a temp item
		VendingMachineItem item1, item2;
		
		for (int i = 0; i < codes.length; i++) {
			// get it out
			item1 = machine.getItem(codes[i]);
			// remove it
			item2 = machine.removeItem(codes[i]);
			// check its correctness
			assertSame(item1, item2);
			// check whether the slot is empty or not 
			assertNull(machine.getItem(codes[i]));
		}
	}
	
	@Test (expected = VendingMachineException.class)
	public void testRemoveItemException(){
		machine.removeItem(codes[0]);
	}
	
	
	/**
	 * Test insertItem method
	 */
	@Test
	public void testInsertMoney(){
		// sample amount
		double amount = 200.0;
		// get it current balance
		double oldBalance = machine.getBalance();
		// insert new amount
		machine.insertMoney(amount);
		// test its correctness
		assertEquals(amount + oldBalance, machine.getBalance(), 0.0);
	}
	
	@Test (expected = VendingMachineException.class)
	public void testInsertMoneyException(){
		// sample amount
		double amount = -200.0;
		machine.insertMoney(amount);
	}
	
	/**
	 * Test getBalance method
	 */
	@Test
	public void testGetBalance(){
		// initial balance is zero
		assertEquals(0.0, machine.getBalance(), 0.0);		
	}
	
	/**
	 * Test makePurchase method
	 */
	@Test
	public void testMakePurchase(){
		// add all items
		addItemToMachine();
		// we cannot purchase any item right now because the balance is 0 
		assertFalse(machine.makePurchase(codes[0]));
		
		// set a purchase code 
		String code = codes[0];
		// get the time which has that code
		VendingMachineItem item = machine.getItem(code);
		// create a amount
		double amount = item.getPrice() + 100;
		// insert it 		
		machine.insertMoney(amount);
		// test the correctness
		assertTrue(machine.makePurchase(codes[0]));
		// whether the balance is reduce correctly 
		assertEquals(amount - item.getPrice(), machine.getBalance(), 0.0);
		// whether the slot is empty now
		assertNull(machine.getItem(code));
	}
	
	/**
	 * Test returnChange method
	 */
	@Test
	public void testReturnChange (){
		// temp amount 
		double amount = 200.0;
		// add it to the machine
		machine.insertMoney(amount);
		// get current balance
		double balance = machine.getBalance();
		// get change
		double change = machine.returnChange();
		
		// test its correctness
		assertEquals(balance, change, 0.0);		
		assertEquals(0.0, machine.getBalance(), 0.0);
	}
		
}
