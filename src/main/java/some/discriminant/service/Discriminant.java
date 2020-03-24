package some.discriminant.service;

import org.springframework.stereotype.Service;

@Service
public class Discriminant {

    public double calculate(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
}