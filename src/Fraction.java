public class Fraction {
    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator can't be zero");
        }
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);
        normalize();
    }

    private int gcd(int numerator, int denominator) {
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denominator;
    }

    private void normalize() {
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= n;
        denominator /= n;
    }

    @Override
    public String toString() {
        if (denominator == 1) return String.valueOf(numerator);
        return numerator + " / " + denominator;
    }
}
