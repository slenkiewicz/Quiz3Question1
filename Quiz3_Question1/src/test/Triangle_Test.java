package base;

import static org.junit.Assert.*;
import base.Triangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		
	}
	
	@Test
	public void areaTest1() {
		Triangle myTri = new Triangle(1.0, 1.0, 1.0);
		double expectedresult = .433;
		double actualresult = myTri.getArea();
		assertEquals(expectedresult, actualresult, 0.1);
	}
	
	@Test
	public void areaTest2() {
		Triangle myTri = new Triangle(3.0, 4.0, 5.0);
		double expectedresult = 6.0;
		double actualresult = myTri.getArea();
		assertEquals(expectedresult, actualresult, 0.1);
	}
	
	@Test
	public void perimeterTest1() {
		Triangle myTri = new Triangle(5.0, 6.0, 7.0);
		double expectedresult = 13.0;
		double actualresult = myTri.getPerimeter();
		assertEquals(expectedresult, actualresult, 0.01);
	}
	
	@Test
	public void perimeterTest2() {
		Triangle myTri = new Triangle(2.0, 4.0, 5.0);
		double expectedresult = 11.0;
		double actualresult = myTri.getPerimeter();
		assertEquals(expectedresult, actualresult, 0.01);
	}
}
