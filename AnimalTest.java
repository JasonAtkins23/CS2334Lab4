/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException 
    {
    	// full constructor
    	Animal animal = new Animal("red", "Monkey", 5.5, 10.5);
    	
    	// tests the full constructor and get methods
    	Assert.assertEquals("red", animal.getColor());
    	Assert.assertEquals("Monkey", animal.getName());
    	Assert.assertEquals(5.5, animal.getWeight(), 0.01);
    	Assert.assertEquals(10.5, animal.getHeight(), 0.01);
    	
    }
    
    public void animalToStringTest() throws AssertException 
    {
    	// full constructor
    	Animal animal = new Animal("red", "Monkey", 5.5, 10.5);
    	
    	// tests the toString method and get methods
    	String expected = String.format("%s, a %s-colored animal. %.1f pounds, %.1f inches\n", 
    			"Monkey", "red", 5.5, 10.5);
    	String actual = animal.toString();
    	
    	Assert.assertEquals(expected, actual);
    }
    
    public void animalEqualsTest() throws AssertException
    {
    	// tests identical objects
    	Animal ani = new Animal("red", "Monkey", 20.5, 45.5);
    	Assert.assertTrue(ani.equals(ani));
    		
   		// tests objects of different classes
   		String fail = "not the same object";
   		Assert.assertFalse(ani.equals(fail));
    			
   		// tests different animals
    	Animal aniDiff = new Animal("blue", "Turtle", 20.5, 45.5);
    	Assert.assertFalse(aniDiff.equals(ani));
    }
}
}

