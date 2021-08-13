package calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultipleTest {

    @Test
    public void multipleTest() {
        Assert.assertEquals(Multiple.run(3, 1), 3);
        Assert.assertEquals(Multiple.run(6, 3), 18);
        Assert.assertEquals(Multiple.run(10, 2), 20);
        Assert.assertEquals(Multiple.run(333, 3), 999);
    }
}
