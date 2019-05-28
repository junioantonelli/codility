import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GenomeRangeQueryTest {
    String[] sequence;
    int[] expected;
    int[] P;
    int[] Q;
    GenomeRangeQuery solution;

    public GenomeRangeQueryTest(String[] sequence, int[] P, int[] Q, int[] expected) {
        this.sequence = sequence;
        this.expected = expected;
        this.P = P;
        this.Q = Q;
    }

    @Before
    public void initialize() {
        this.solution = new GenomeRangeQuery();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"CAGCCTA".split(""), new int[]{2, 5, 0}, new int[]{4, 5, 6}, new int[]{2, 4, 1} }
        });
    }

    @Test
    public void test() {
        assertArrayEquals(this.expected, this.solution.solution(this.sequence,this.P,this.Q));
    }

}

