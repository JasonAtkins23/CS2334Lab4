
public class ZooTest {
	
	public void zooGetTotalHeightTest() throws AssertException
	{
		Zoo zooObj = new Zoo(3);
		
		Animal ani = new Animal("green", "Lizard", 2.5, 1.0);
		Animal ani2 = new Animal("blue", "Fish", 1.0, 5.0);
		Animal ani3 = new Animal("yellow", "Lion", 150.15, 4.60);
		
		zooObj.addAnimal(ani);
		zooObj.addAnimal(ani2);
		zooObj.addAnimal(ani3);
		
		double expected = 10.6;
		double actual = zooObj.getTotalHeight();
		
		Assert.assertEquals(expected, actual);
	}
	
	public void zooGetCapacityTest() throws AssertException
	{
		// testing capacity when under the max
		Zoo zooObj = new Zoo(3);
		
		Animal ani = new Animal("green", "Lizard", 2.5, 1.0);
		Animal ani2 = new Animal("blue", "Fish", 1.0, 5.0);
		Animal ani3 = new Animal("yellow", "Lion", 150.15, 4.60);
		
		zooObj.addAnimal(ani);
		zooObj.addAnimal(ani2);
		zooObj.addAnimal(ani3);
		
		int expected = 3;
		int actual = zooObj.getCapacity();
		
		Assert.assertEquals(expected, actual);
		
		// testing capacity when having to expand
		Animal ani4 = new Animal("white", "Rabbit", 10.5, 3.2);
		
		zooObj.addAnimal(ani4);
		
		int expected2 = 6;
		int actual2 = zooObj.getCapacity();
		
		Assert.assertEquals(expected2, actual2);
	}
	
	public void zooToStringTest() throws AssertException
	{
		Zoo zooObj = new Zoo(3);
		
		Animal ani = new Animal("green", "Lizard", 2.5, 1.0);
		Animal ani2 = new Animal("blue", "Fish", 1.0, 5.0);
		
		zooObj.addAnimal(ani);
		zooObj.addAnimal(ani2);
		
		String result = "These animals live in the zoo: \n";
		String expected = result + ani.toString() + ani2.toString();
		String actual = zooObj.toString();
		
		Assert.assertEquals(expected, actual);
	}
}