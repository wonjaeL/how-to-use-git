package calculator;

import org.junit.Assert;
import org.junit.Test;

public class SubstractTest {
    @Test
    public void substractTest() {
        Assert.assertEquals(Substract.run(5, 1), 4);
        Assert.assertEquals(Substract.run(3, 2), 1);
        Assert.assertEquals(Substract.run(555, 333), 222);
        Assert.assertEquals(Substract.run(5, 10), -5);
    }
}
