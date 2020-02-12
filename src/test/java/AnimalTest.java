import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal = new Animal();

    Dog dog = new Dog();
    Cat cat = new Cat();


    @Test
    public void TestDogSound(){

        Assert.assertEquals(dog.sounds(), "Barks");
    }
    @Test
    public void TestDogEat(){

        Assert.assertEquals(dog.eat(), "Food");
    }
@Test
     public void TestCatSound(){

        Assert.assertEquals(cat.eat(), "Food");
}

@Test
  public void TestCatEat(){

    Assert.assertEquals(cat.sounds(), "Meow");
}


}