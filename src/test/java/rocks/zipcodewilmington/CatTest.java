package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        Cat cat = new Cat(null, null, null);
        String givenName = "Kit kat";
        cat.setName(givenName);
        String actualName = cat.getName();

        Assert.assertEquals(givenName, actualName);
    }

    @Test
    public void setBirthdayTest(){
        Cat cat = new Cat(null, null, null);
        cat.setBirthDate(new Date(2323223232L));
        String givenBirthDate = "Tue Jan 27 16:20:23 EST 1970";
        String retrievedBirthDate = cat.getBirthDate().toString();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat(null, null, null);
        String givenSpeak = "meow!";
        String retrievedSpeak = cat.speak();

        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat(null, null, null);
        int givenMeals = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int expectedMeals = cat.getNumberOfMealsEaten();

        Assert.assertEquals(givenMeals + 1, expectedMeals);
    }


    @Test
    public void getIDTest(){
        Integer givenID = 123;
        Cat cat = new Cat(null, null, givenID);
        Integer retrievedID = cat.getId();

        Assert.assertEquals(givenID, retrievedID);
    }

    @Test
    public void instanceOfAnimalTest(){
        boolean expected = true;
        Cat cat = new Cat(null, null, null);
        boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOfMammalTest(){
        boolean expected = true;
        Cat cat = new Cat(null, null, null);
        boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }

}
