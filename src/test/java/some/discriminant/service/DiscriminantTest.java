package some.discriminant.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
class DiscriminantTest {
    final double expectedResult = -44.0;
    final double delta = 1e-15;
    double a = 3;
    double b = 2;
    double c = 4;

    private Discriminant discriminant = new Discriminant();

    @Test
    void calculate() {
        double testResult = discriminant.calculate(a, b, c);
        System.out.println(testResult);
        Assert.assertEquals(expectedResult, testResult, delta);
    }
}