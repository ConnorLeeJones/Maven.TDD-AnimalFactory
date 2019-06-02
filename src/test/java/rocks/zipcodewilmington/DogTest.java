package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }






    @Test
    public void setBirthdayTest(){
        Dog dog = new Dog(null, null, null);
        dog.setBirthDate(new Date(2323223232L));
        String givenBirthDate = "Tue Jan 27 16:20:23 EST 1970";
        String retrievedBirthDate = dog.getBirthDate().toString();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog(null, null, null);
        String givenSpeak = "bark!";
        String retrievedSpeak = dog.speak();

        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void eatTest(){
        Dog dog = new Dog(null, null, null);
        int givenMeals = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        int expectedMeals = dog.getNumberOfMealsEaten();

        Assert.assertEquals(givenMeals + 1, expectedMeals);
    }


    @Test
    public void getIDTest(){
        Integer givenID = 123;
        Dog dog = new Dog(null, null, givenID);
        Integer retrievedID = dog.getId();

        Assert.assertEquals(givenID, retrievedID);
    }

    @Test
    public void instanceOfAnimalTest(){
        boolean expected = true;
        Dog dog = new Dog(null, null, null);
        boolean actual = dog instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOfMammalTest(){
        boolean expected = true;
        Dog dog = new Dog(null, null, null);
        boolean actual = dog instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }


}
