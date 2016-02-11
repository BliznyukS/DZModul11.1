package lesson11TarasExample;

import org.junit.Assert;

public class SimpleMathTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        int a = 4;
        int b = 7;

        final SimpleMath simpleMath = new SimpleMath();

        final int result = simpleMath.add(a, b);

        Assert.assertEquals(11, result);
    }
}