package stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by User on 6/1/2016.
 */
public class FixedCapacityStackTest {

    private BufferedReader in = null;

    @Before
    public void setup() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        in = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream("FixedCapacityStackData.txt")));
    }

    @After
    public void teardown() throws IOException {
        if (in != null) {
            in.close();
        }
        in = null;
    }

    @Test
    public void test() throws IOException {

        List<String> strings = in.lines().collect(Collectors.toList());
        FixedCapacityStack<String> stack = new FixedCapacityStack<>(strings.size());

        for (String item : strings) {
            if (!item.equals("-")) {
                stack.push(item);
            } else {
                System.out.println(stack.pop() + " ");
            }
        }
        
        System.out.println("Left on stack: ");
        for (String s : stack) {
            System.out.println(s + " ");
        }

        assertThat(stack.pop(), is("is"));
        assertThat(stack.pop(), is("be"));
        assertThat(stack.pop(), is("to"));
    }
}
