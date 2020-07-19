import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testWordOne(){
        String test = "Hello World!";
        String resut = ReverseString.reverseWord(test);
        Assert.assertEquals(resut,"!dlroW olleH");
    }

}
