/**
 * 
 */
package LearnGit2Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import LearnGit2.House;

/**
 * @author John
 *
 */
public class HouseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link LearnGit2.House#turnOnLights()}.
	 */
	@Test
	public void testTurnOnLights() {
		House house1 = new House();
		house1.turnOnLights();
	}
	
	/**
	 * Test method for {@link LearnGit2.House#turnOnLights2()}.
	 */
	@Test
	public void testTurnOnLights2(){
		House house2 = new House();
		int  result = house2.turnOnLights2(0);
		assertEquals(result,0);
	}

	/**
	 * Test method for{@link HouseTest.House#multiplyByThree()}.
	 */
	@Test
	public void testMultiplyByThree(){
		House house3 = new House();
		int result = house3.multiplyByThree(1);
		assertEquals(1 * 3, result);
	}
	
	@Test
	public void testMultiplyByThree2(){
		House house4 = new House();
		int parameterPassedIn = 2;
		int result = house4.multiplyByThree(parameterPassedIn);
		assertEquals(2 * 3, result);
	}
	
	@Test
	public void testMultiplyByThree3(){
		House house5 = new House();
		int parameterPassedIn = 2;
		
		int result = 1;
		int rValue = 0;
		while (result < 4) {
			rValue = house5.multiplyByThree(result);
			System.out.println("result: " + result + " rValue: " + rValue);
			assertEquals(result * 3, rValue);
			result++; //increment must come after assertEquals, because I'm relying on previous, unchanged values
		}
	}
	
	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

}
