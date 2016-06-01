package dijkstra;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by User on 6/1/2016.
 */
public class DijkstraTwoStackTest {

    @Test
    public void test() {
        ArrayList<String> expression = new ArrayList<>();
        expression.addAll(Arrays.asList("(", "1", "+", "(", "(", "2", "+", "3", ")", "*", "(", "4", "*", "5", ")", ")", ")"));
        Double value = DijkstraTwoStack.evaluate(expression);
        assertThat(value, is(101.0));
    }
}