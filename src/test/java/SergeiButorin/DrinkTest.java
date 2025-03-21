package SergeiButorin;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DrinkTest {
    @Test
    public void testDrinkForAge() {
        Assert.assertEquals(Main.peopleWithAgeDrink(12),"drink toddy");
        Assert.assertEquals(Main.peopleWithAgeDrink(16),"drink coke");
        Assert.assertEquals(Main.peopleWithAgeDrink(20),"drink beer");
        Assert.assertEquals(Main.peopleWithAgeDrink(25),"drink whisky");

    }
}
