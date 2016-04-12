package edu.towson.cis.cosc603.project3.vendingmachine;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ VendingMachineItemTest.class, 
	VendingMachineTest.class, 
	VendingMachineExceptionTest.class })
public class AllTests {

}
