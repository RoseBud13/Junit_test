package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;;

public class RecipeTest {

	@Test
	public void testGetAmtChocolate_defaultAmt() {
		try {
			int amtChocolate = new Recipe().getAmtChocolate();
			assertEquals(0, amtChocolate);
		} catch (Exception e) {
			fail("the default amount should be 0");
		}
		
	}

	@Test
	public void testSetAmtChocolate_positiveNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtChocolate("5");
			assertEquals(5, r.getAmtChocolate());
		} catch (Exception e) {
			fail("the parameter of amount should be a positive number");
		}
	}
	
	@Test
	public void testSetAmtChocolate_string() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtChocolate("chocolate");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}
	
	@Test
	public void testSetAmtChocolate_negativeNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtChocolate("-2");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}

	@Test
	public void testGetAmtCoffee_defaultAmt() {
		try {
			int amtCoffee = new Recipe().getAmtCoffee();
			assertEquals(0, amtCoffee);
		} catch (Exception e) {
			fail("the default amount should be 0");
		}
		
	}

	@Test
	public void testSetAmtCoffee_positiveNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtCoffee("5");
			assertEquals(5, r.getAmtCoffee());
		} catch (Exception e) {
			fail("the parameter of amount should be a positive number");
		}
	}
	
	@Test
	public void testSetAmtCoffee_string() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtCoffee("coffee");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}
	
	@Test
	public void testSetAmtCoffee_negativeNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtCoffee("-1");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}

	@Test
	public void testGetAmtMilk_defaultAmt() {
		try {
			int amtMilk = new Recipe().getAmtMilk();
			assertEquals(0, amtMilk);
		} catch (Exception e) {
			fail("the default amount should be 0");
		}
	}

	@Test
	public void testSetAmtMilk_positiveNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtMilk("5");
			assertEquals(5, r.getAmtMilk());
		} catch (Exception e) {
			fail("the parameter of amount should be a positive number");
		}
	}
	
	@Test
	public void testSetAmtMilk_string() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtMilk("Milk");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}
	
	@Test
	public void testSetAmtMilk_negativeNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtMilk("-1");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}

	@Test
	public void testGetAmtSugar_defaultAmt() {
		try {
			int amtSugar = new Recipe().getAmtSugar();
			assertEquals(0, amtSugar);
		} catch (Exception e) {
			fail("the default amount should be 0");
		}
	}

	@Test
	public void testSetAmtSugar_positiveNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtSugar("5");
			assertEquals(5, r.getAmtSugar());
		} catch (Exception e) {
			fail("the parameter of amount should be a positive number");
		}
	}
	
	@Test
	public void testSetAmtSugar_string() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtSugar("Sugar");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}
	
	@Test
	public void testSetAmtSugar_negativeNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setAmtSugar("-1");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}

	@Test
	public void testGetName_defaultName() {
		try {
			String name = new Recipe().getName();
			assertEquals("", name);
		} catch (Exception e) {
			fail("the default name should be null");
		}
		
	}

	@Test
	public void testSetName_string() {
		try {
			Recipe r = new Recipe();
			r.setName("Latte");
			assertEquals("Latte", r.getName());
		} catch (Exception e) {
			fail("the name should be the same string as input");
		}
		
	}
	
	@Test
	public void testSetName_null() {
		try {
			Recipe r = new Recipe();
			r.setName("");
			fail("exception should be thrown");
		} catch (Exception e) {
			fail("null shoud not be allowed as a recipe name");
		}
	}

	@Test
	public void testGetPrice_defaultAmt() {
		try {
			int price = new Recipe().getPrice();
			assertEquals(0, price);
		} catch (Exception e) {
			fail("the default amount should be 0");
		}
		
	}

	@Test
	public void testSetPrice_positiveNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setPrice("5");
			assertEquals(5, r.getPrice());
		} catch (Exception e) {
			fail("the parameter should be positive number");
		}
	}
	
	@Test
	public void testSetPrice_string() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setPrice("Price");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}
	
	@Test
	public void testSetPrice_negativeNum() throws RecipeException {
		try {
			Recipe r = new Recipe();
			r.setPrice("-1");
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
			//success if thrown
		}
	}

}
