package edu.towson.cis.cosc603.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineExceptionTest {
	
	VendingMachineException e;
	
	@Before
	public void setUp() throws Exception {
		e = new VendingMachineException();
	}

	@After
	public void tearDown() throws Exception {
		e = null;
	}

	@Test
	public void testVendingMachineException() {
		
	}

}
