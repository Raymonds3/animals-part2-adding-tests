import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void TestDogSound(){
        Dog dog = new Dog();
        String dogsound = dog.sounds();
        Assert.assertEquals(dogsound,"Barks"); //pass
//        Assert.assertEquals(dogsound,"barks"); //fails
    }
}
