package some.discriminant.util;

public class Discriminant {

    public static double calculate(double a, double b, double c) {
        double dis = Math.pow(b, 2) - (4 * a * c);
        return dis;
    }
}