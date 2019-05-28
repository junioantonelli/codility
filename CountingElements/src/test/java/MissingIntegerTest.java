import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MissingIntegerTest {
    int[] array;
    int expected;
    MissingInteger solution;

    public MissingIntegerTest(int[] array, int expected) {
        this.array = array;
        this.expected = expected;
    }

    @Before
    public void initialize() {
        this.solution = new MissingInteger();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {new int[]{5, 6, 3, 1, 2, 9, 7, 8, 4, 11}, 10}
        });


    }

    @Test
    public void test() {
        Assert.assertEquals("Testing solution", expected, this.solution.solution(this.array));
    }

}
