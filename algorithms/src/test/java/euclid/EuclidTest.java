package euclid;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by User on 6/1/2016.
 */
public class EuclidTest {

    @Test
    public void test() {
        int a = 56;
        int b = 32;
        int gcd = Euclid.evaluate(a, b);
        assertThat(gcd, is(8));
    }

}
