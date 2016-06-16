package base64;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * Created by User on 6/9/2016.
 */
public class Base64Test {

    @Test
    public void test() {
        String base64 = "aHR0cDovL3d3dy56eHRlYW0ubmV0";
        byte[] bytes = Base64.base64Decode(base64);
        System.out.print(new String(bytes));
        assertThat(new String(bytes), is("http://www.zxteam.net"));
    }
}
