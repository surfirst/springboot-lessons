package surfirst.restful.lesson1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import surfirst.restful.lesson1.models.Greeting;

@RestController
public class GreetingController {

    @GetMapping("greeting")
    public Greeting GetGreeting(){
        return new Greeting();
    }
}
