package base36;

import java.math.BigInteger;

/**
 * Created by User on 6/9/2016.
 */
public class Base36 {

    public static String base36Decode(String input)    {
        BigInteger base10 = new BigInteger(input, 36);
        String base16 = base10.toString(16);
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < base16.length(); i += 2) {
            String hex = base16.substring(i, i+2);
            string.append((char)Integer.parseInt(hex, 16));
        }
        return string.toString();
    }

    public static String base36Encode(String in)       {
        BigInteger base36 = new BigInteger(1, in.getBytes());
        return base36.toString(36).toUpperCase();
    }
}
