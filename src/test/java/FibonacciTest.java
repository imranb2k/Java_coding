import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacciSequenceOne() {

        assertEquals("Fib number 1",1, Fibonacci.getFib(1));

    }

    @Test
    public void testFibonacciSequenceTen() {

        int fibNum = 10;

        List<Integer> fibSeries = new ArrayList<Integer>();

        for (int i =0; i <= fibNum; i++) {
            fibSeries.add(Fibonacci.getFib(i));
        }

        assertThat(fibSeries, is(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55)));
    }
}
