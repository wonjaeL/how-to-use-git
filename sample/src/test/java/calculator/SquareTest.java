package calculator;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void squareTest() {
        Assert.assertEquals(Square.run(3), 9);
        Assert.assertEquals(Square.run(6), 36);
        Assert.assertEquals(Square.run(9), 81);
        Assert.assertEquals(Square.run(20), 40);
    }
}
