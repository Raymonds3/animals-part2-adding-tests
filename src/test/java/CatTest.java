import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void TestCatSound(){
        Cat cat = new Cat();
        String catsound = cat.sounds();
//        Assert.assertEquals(catsound,"Barkark");//fail
        Assert.assertEquals(catsound,"Meows"); //pass
    }
}
