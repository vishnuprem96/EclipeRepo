package junitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitDemo {

	/*@Test
	public void openMSWord()
	{
		//System.out.println("This is Test1");
		System.out.println("opening MS Word");
	}
	
	@Test
	public void enterTxt() 
	{
		//System.out.println("This is Test2");
		System.out.println("Entering data");
	}
	
	@Test
	public void clickonMenu() 
	{
		//System.out.println("This is Test3");
		System.out.println("clicking on file menu ");
	}*/
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This is Before Class");
		
	}
	
	@Before
	public  void before()
	{
		System.out.println("This is Before");
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is Test1");
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is Test2");
		
	}
	
	@After
	public  void after()
	{
		System.out.println("This is After");
		
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This is afterClass");
		
	}

}
