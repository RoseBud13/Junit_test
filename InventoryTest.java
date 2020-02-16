package edu.ncsu.csc326.coffeemaker;
import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {


@Test
public void testGetChocolate_defaultAmt() {
  try {
		Inventory i =new Inventory();
		int amtChocolate = i.getChocolate() ;
		assertEquals(15, amtChocolate);
		i=null;
} catch (Exception e) {
		fail("the default amount of chocolate in Inventory should be 15");
}
 }


@Test
public void testGetSugar_defaultAmt() {
  try {
		Inventory i =new Inventory();
		int amtSugar = i.getSugar() ;
		assertEquals(15, amtSugar);
		i=null;
} catch (Exception e) {
		fail("the default amount of sugar in Inventory should be 15");
}
 }


 @Test
 public void testGetMilk_defaultAmt() {
   try {
 		Inventory i =new Inventory();
 		int amtMilk = i.getMilk() ;
 		assertEquals(15, amtMilk);
		i=null;
 } catch (Exception e) {
 		fail("the default amount of milk in Inventory should be 15");
 }
  }


	@Test
  public void testGetCoffee_defaultAmt() {
    try {
  		Inventory i =new Inventory();
  		int amtCoffee = i.getCoffee() ;
  		assertEquals(15, amtCoffee);
 		i=null;
  } catch (Exception e) {
  		fail("the default amount of coffee in Inventory should be 15");
  }
   }


    @Test
    public void testSetCoffee_positiveInput() {
      try {
    		Inventory i =new Inventory();
    	  i.setCoffee(100) ;
    		assertEquals(100, i.getCoffee());
  	 	i=null;
    } catch (Exception e) {
    		fail("the set coffee method errors when the input is a positive integer");
    }
     }


    //indicate that error handling for negative input for setCoffee is missing
	@Test
	   public void testSetCoffee_negativeInput() {
	     try {
	   		Inventory i =new Inventory();
	   	  i.setCoffee(-100) ;
	   		fail("InventoryException should be thrown");
	  		i=null;
	   } catch (Exception e) {
		 //success if thrown
	   }
	    }

    @Test
    public void testSetMilk_positiveInput() {
      try {
    		Inventory i =new Inventory();
    	  i.setMilk(100) ;
    		assertEquals(100, i.getMilk());
  	 	i=null;
    } catch (Exception e) {
    		fail("the set coffee method errors when the input is a positive integer");
    }
     }


    //indicate that error handling for negative input for setMilk is missing
	@Test
	   public void testSetMilk_negativeInput() {
	     try {
	   		Inventory i =new Inventory();
	   	  i.setMilk(-100) ;
	   		fail("InventoryException should be thrown");
	  		i=null;
	   } catch (Exception e) {
		 //success if thrown
	   }
	    }



   //indicate the logic faults in the addSugar method
	@Test
	   public void testaddSugar_positiveInput() {
	     try {
	   		Inventory i =new Inventory();
	   	  i.setSugar(100) ;  //already tested
	   	  i.addSugar("99");
	   	  assertEquals(199, i.getSugar());  //getSugar()already tested
	   	  i=null;
	   } catch (Exception e) {
		   fail("199 is expected,addSugar method has errors");
	   }
	    }

 //  indicate the logic faults in the useIngredients method
	@Test
	   public void testUseIngredients_positiveInput() {
	     try {
	   		Inventory i = new Inventory();
        Recipe r = new Recipe();
        r.setName("testrecipe");
        r.setPrice ("1");
        r.setAmtCoffee ("1");
        r.setAmtMilk ("1");
        r.setAmtSugar ("1");
        r.setAmtChocolate ("1");

        i.useIngredients(r);

	  	assertEquals(14, i.getCoffee());
	   	assertEquals(14, i.getMilk());
	   	assertEquals(14, i.getSugar());
	   	assertEquals(14, i.getChocolate());

	   	i=null;
	   } catch (Exception e) {
		   fail("all 14 is expected, useIngredient method has errors");
	   }
	    }

}
