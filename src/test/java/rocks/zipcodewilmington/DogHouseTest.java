package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }


    @Test
    public void addDogTest() {
        Dog expected = new Dog(null, null, 2);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(expected);
        Dog actual = DogHouse.getDogById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest(){
        Dog expected = null;
        Dog doggo = new Dog(null, null, 2);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(doggo);
        house.remove(doggo);
        Dog actual = house.getDogById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatByIDTest(){
        Dog expected = null;
        Dog dog = new Dog(null, null, 2);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(dog);
        house.remove(2);
        Dog actual = house.getDogById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIDTest(){
        Dog expected = new Dog(null, null, 2);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(expected);
        Dog actual = house.getDogById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        Integer expected = 4;
        DogHouse house = new DogHouse();
        house.clear();
        house.add(new Dog(null, null, 1));
        house.add(new Dog(null, null, 2));
        house.add(new Dog(null, null, 3));
        house.add(new Dog(null, null, 4));
        Integer actual = house.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }




}
