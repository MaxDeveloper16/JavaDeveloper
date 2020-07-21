import org.junit.Assert;
import org.junit.Test;

public class TranslateNumberToStringTest {
    @Test
    public void translateNumberToWordTest1() throws Exception {
        Assert.assertEquals(TranslateNumberToString.translateNumberToWord(10245), "ten thousand two hundred forty five");
    }

    @Test
    public void translateNumberToWordTest2() throws Exception {
        Assert.assertEquals(TranslateNumberToString.translateNumberToWord(125), "one hundred twenty five");
    }
}
