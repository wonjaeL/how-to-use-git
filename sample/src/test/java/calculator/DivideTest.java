package calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {

    @Test
    public void divideTest() {
        Assert.assertEquals(Divide.run(3, 1), 3, 0.01);
        Assert.assertEquals(Divide.run(6, 3), 2, 0.01);
        Assert.assertEquals(Divide.run(10, 2), 5, 0.01);
        Assert.assertEquals(Divide.run(333, 3), 111, 0.01);
    }
}
