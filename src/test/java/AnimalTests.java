import org.junit.Assert;
import org.junit.Test;

public class AnimalTests {
    @Test
    public void TestDogSound(){
        Dog dog = new Dog();
        String dogsound = dog.sounds();
        Assert.assertEquals(dogsound,"Barks"); //pass
        Assert.assertEquals(dogsound,"barks"); //fails
    }
    @Test
    public void TestDogEats(){
        Dog dog = new Dog();
        String dogeats = dog.eat();
        Assert.assertEquals(dogeats,"meat");//fails
        Assert.assertEquals(dogeats, "Food");//pass
        Assert.assertEquals(dogeats,"food");//fails
    }
    @Test
    public void TestCatSound(){
        Cat cat = new Cat();
        String catsound = cat.sounds();
        Assert.assertEquals(catsound,"Barkark");//fail
        Assert.assertEquals(catsound,"Meows"); //pass
    }
    @Test
    public void TestCatEats(){
        Cat cat = new Cat();
        String cateats = cat.eat();
        Assert.assertEquals(cateats,"Food");//pass
        Assert.assertEquals(cateats,"meat");//fails
        Assert.assertEquals(cateats,"food");//fails
    }
}
