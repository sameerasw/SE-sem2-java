import org.junit.Test;

import static org.junit.Assert.*;

public class Tute_07_JunitTest {
    @org.junit.Test
    public void addNumbers() throws Exception {
        Tute_07_Junit tute_07_junit = new Tute_07_Junit();
        int result = tute_07_junit.addNumbers( 5, 2);
        assertEquals(7, result);
    }

    @org.junit.Test
    public void multiplyNumbers() throws Exception {
        Tute_07_Junit tute_07_junit = new Tute_07_Junit();
        int result = tute_07_junit.multiplyNumbers( 5, 2);
        assertEquals(10, result);
    }

    @Test
    public void divideNumbers() throws Exception {
        Tute_07_Junit tute_07_junit = new Tute_07_Junit();
        float result = tute_07_junit.divideNumbers( 5, 2);
        assertEquals(2.5, result, 0.0001);
    }
}