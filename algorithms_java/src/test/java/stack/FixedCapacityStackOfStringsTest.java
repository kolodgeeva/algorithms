package stack;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by User on 5/31/2016.
 */
public class FixedCapacityStackOfStringsTest {

    @Test
    public void test() {

        FixedCapacityStackOfStrings strings = new FixedCapacityStackOfStrings(5);

        strings.push("1");
        strings.push("2");
        strings.push("3");
        strings.push("4");
        strings.push("5");

        assertThat(strings.pop(), is("5"));
        assertThat(strings.pop(), is("4"));
        assertThat(strings.pop(), is("3"));
        assertThat(strings.pop(), is("2"));
        assertThat(strings.pop(), is("1"));
    }

}
