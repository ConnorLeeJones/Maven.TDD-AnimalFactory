package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void dogTest(){
        Dog dog = AnimalFactory.createDog("Roscoe", new Date(2323223232L));

        String actualName = "Roscoe";
        String expectedName = dog.getName();

        String actualBirthday = new Date(2323223232L).toString();
        String expectedBrthday = "Tue Jan 27 16:20:23 EST 1970";

        Assert.assertEquals(actualName, expectedName);
        Assert.assertEquals(actualBirthday, expectedBrthday);
    }

    @Test
    public void catTest(){
        Cat cat = AnimalFactory.createCat("Kipper", new Date(2323223232L));

        String actualName = "Kipper";
        String expectedName = cat.getName();

        String actualBirthday = new Date(2323223232L).toString();
        String expectedBirthday = "Tue Jan 27 16:20:23 EST 1970";

        Assert.assertEquals(actualName, expectedName);
        Assert.assertEquals(actualBirthday, expectedBirthday);
    }

}
