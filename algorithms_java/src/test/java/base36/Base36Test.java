package base36;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * Created by User on 6/9/2016.
 */
public class Base36Test {

    @Test
    public void test() {

        String base36 = "2T8KTUDOG0AZZHRJN287DLG5Q5YZ7G7K4P1CKOILW8A90ZNY45V2XMRYSUDUYICKJF1";
        String string = Base36.base36Decode(base36);
        System.out.println(string);
        assertThat(string, is("https://hr.zxteam.net/offer/wkk8qgLQWbEYRSM"));

        string = "https://hr.zxteam.net/offer/wkk8qgLQWbEYRSM";
        base36 = Base36.base36Encode(string);
        System.out.println(base36);
        assertThat(base36, is("2T8KTUDOG0AZZHRJN287DLG5Q5YZ7G7K4P1CKOILW8A90ZNY45V2XMRYSUDUYICKJF1"));
    }
}
