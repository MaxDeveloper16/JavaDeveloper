import org.junit.Assert;

public class FindDuplicateTest {
    @org.junit.Test
    public void findDuplicateTest1() throws Exception {
        Assert.assertEquals(FindDuplicate.getDuplicateNumber("abcabc"), 3);
    }

    @org.junit.Test
    public void findDuplicateTest2() throws Exception {
        Assert.assertEquals(FindDuplicate.getDuplicateNumber("abcde"), -1);
    }
}
