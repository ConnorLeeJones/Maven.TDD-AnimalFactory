package rocks.zipcodewilmington;

import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import org.junit.Test;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest(){
        Cat expected = new Cat(null, null, 2);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(expected);
        Cat actual = house.getCatById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest(){
        Cat expected = null;
        Cat cat = new Cat("Kit", null, 2);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(cat);
        house.remove(cat);
        Cat actual = house.getCatById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatByIDTest(){
        Cat expected = null;
        Cat cat = new Cat("Kit", null, 2);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(cat);
        house.remove(2);
        Cat actual = house.getCatById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIDTest(){
        Cat expected = new Cat("Kit", null, 2);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(expected);
        Cat actual = house.getCatById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        Integer expected = 4;
        CatHouse house = new CatHouse();
        house.clear();
        house.add(new Cat(null, null, 1));
        house.add(new Cat(null, null, 2));
        house.add(new Cat(null, null, 3));
        house.add(new Cat(null, null, 4));
        Integer actual = house.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }



}
