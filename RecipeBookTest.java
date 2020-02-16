package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecipeBookTest {
	
	@Test
	public void testGetRecipes_default() {
		try {
			Recipe[] expected = new RecipeBook().getRecipes();
			Recipe[] actual = new RecipeBook().getRecipes();
			assertArrayEquals(expected, actual);
		} catch (Exception e) {
			fail("they should be the same");
		}
	}

	@Test
	public void testAddRecipe_defaultRecipe() {
		try {
			RecipeBook rb = new RecipeBook();
			Recipe r = new Recipe();
			assertTrue(rb.addRecipe(r));
		} catch (Exception e) {
			fail("the returned value should be true");
		}
	}
	
	@Test
	public void testDeleteRecipe_deleteRecipe() {
		try {
			Recipe r = new Recipe();
			RecipeBook rb = new RecipeBook();
			rb.addRecipe(r);
			rb.deleteRecipe(1);
			assertNull(rb.deleteRecipe(1));
		} catch (Exception e) {
			fail("the recipe does not exist and should return null");
		}
	}

	@Test
	public void testEditRecipe_recipeDeleted() {
		try {
			Recipe r = new Recipe();
			RecipeBook rb = new RecipeBook();
			rb.addRecipe(r);
			rb.deleteRecipe(1);
			assertNull(rb.editRecipe(1, r));
		} catch (Exception e) {
			fail("recipe deleted and should return null");
		}
	}


}
