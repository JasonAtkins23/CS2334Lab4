
public class EquipmentTest {

	public void constructorTest() throws AssertException {

		Equipment equip = new Equipment("Batarang/5, 20.25, 50.55,throws like a boomerang");
        
		Assert.assertEquals(equip.getName(), "Batarang");
		Assert.assertEquals(equip.getCount(), 5);
		Assert.assertEquals(equip.getTotalWeight(), 20.25);
		Assert.assertEquals(equip.getTotalPrice(), 50.55);
		Assert.assertEquals(equip.getDescription(), "throws like a boomerang");
	}
	
	public void equipmentToStringTest() throws AssertException {
		
		Equipment equip = new Equipment("Batarang/5,20.25,50.55,throws like a boomerang");
		
		String expected = String.format("Name: %s, Number: %d, Weight: %.2f lbs, Price: $%.2f - %s",
				"Batarang", 5, 20.25, 50.55, "throws like a boomerang");
		String actual = equip.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	public void equipmentEqualsTest() throws AssertException
	{
		// tests identical objects
		Equipment equip = new Equipment("Batarang/5,20.25,50.55,throws like a boomerang");
		Assert.assertTrue(equip.equals(equip));
		
		// tests objects of different classes
		String fail = "not the same object";
		Assert.assertFalse(equip.equals(fail));
		
		// tests different equipment
		Equipment equipDiff = new Equipment("Gloves/2,2.50,15.50,impenetrable armor on the hands");
		Assert.assertFalse(equipDiff.equals(equip));
	}
}