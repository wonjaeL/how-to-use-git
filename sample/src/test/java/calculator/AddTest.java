package calculator;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {

    @Test
    public void addTest() {
        Assert.assertEquals(Add.run(2, 3), 5);
        Assert.assertEquals(Add.run(5, 7), 12);
        Assert.assertEquals(Add.run(0, 1), 1);
        Assert.assertEquals(Add.run(123, 321), 444);
    }
}
