package edu.towson.cis.cosc603.project3.vendingmachine;

import org.junit.*;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 4/8/16 6:51 PM
 * @author Daniel 
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test(expected = VendingMachineException.class)
	public void testAddItem_3()
		{
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("name", 1.0);
		
		String [] codes = {VendingMachine.A_CODE, VendingMachine.B_CODE,
				VendingMachine.C_CODE,VendingMachine.D_CODE};
		fixture.addItem(item, codes[0]);
		fixture.addItem(item, codes[0]);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project3.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project3.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project3.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Test makePurchase method
	 */
	@Test
	public void testMakePurchase(){
		VendingMachine machine;
		// items for testing
		VendingMachineItem [] items;
		// number of item in the test
		int itemNum = 4;
		// code for insertion 
		String [] codes = {VendingMachine.A_CODE, VendingMachine.B_CODE,
							VendingMachine.C_CODE,VendingMachine.D_CODE};
		machine = new VendingMachine();
		items = new VendingMachineItem[itemNum];
		for (int i = 0; i < items.length; i++) {
			items[i] = new VendingMachineItem("name" + i, (i + 1) * 10.0);
		}
		machine = new VendingMachine();
		items = new VendingMachineItem[itemNum];
		for (int i = 0; i < items.length; i++) {
			items[i] = new VendingMachineItem("name" + i, (i + 1) * 10.0);
		}	
		for (int i = 0; i < codes.length; i++) {
			machine.addItem(items[i], codes[i]);
		}
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
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}
	
	@Test
	public void testGetSlotIndex() throws NoSuchMethodException, 
						SecurityException, IllegalAccessException, 
						IllegalArgumentException, InvocationTargetException {	
		Method method = 
				VendingMachine.class.getDeclaredMethod("getSlotIndex", 
				String.class);
		
		method.setAccessible(true);
		String [] codes = {VendingMachine.A_CODE, VendingMachine.B_CODE,
				VendingMachine.C_CODE,VendingMachine.D_CODE};
		VendingMachine machine = new VendingMachine();
		for (int i = 0; i < codes.length; i++) {
			
			assertEquals(i, (int) method.invoke(machine, codes[i]));
		}
	}
	
	

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}
	
	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/8/16 6:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
		
}