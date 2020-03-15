package some.discriminant.util;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
class DiscriminantTest {
    final double expectedResult = -44.0;
    final double delta = 1e-15;
    double a = 3;
    double b = 2;
    double c = 4;


    @Test
    void calculate() {
        double testResult = Discriminant.calculate(a, b, c);
        System.out.println(testResult);
        Assert.assertEquals(expectedResult, testResult, delta);
    }
}