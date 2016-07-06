package queue;

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
 * Created by User on 6/30/2016.
 */
public class QueueTest {

    private BufferedReader in = null;

    @Before
    public void setup() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        in = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream("StackData.txt")));
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
        Queue<String> queue = new Queue<>();

        for (String item : strings) {
            if (!item.equals("-")) {
                queue.enqueue(item);
            } else {
                queue.dequeue();
            }
        }

        System.out.println("Left on queue: ");
        for (String s : queue) {
            System.out.println(s + " ");
        }

        assertThat(queue.size(), is(3));
        assertThat(queue.dequeue(), is("be"));
        assertThat(queue.dequeue(), is("that"));
        assertThat(queue.dequeue(), is("is"));
    }
}
