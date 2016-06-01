package euclid;

/**
 * It gives greatest common divisor
 */
public class Euclid {

    public static int evaluate(int p, int q) {
        return gcd(p, q);
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
