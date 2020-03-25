package some.discriminant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import some.discriminant.dto.Numbers;
import some.discriminant.service.Discriminant;

@RestController
@RequestMapping("/show")
public class Controller {

    @Autowired
    private Discriminant discriminant;

    @RequestMapping("/result")
    public void printResult(@RequestBody Numbers numbers) {
        var result = discriminant.calculate(numbers.a, numbers.b, numbers.c);
        System.out.println("Result is: " + result);
    }
}
