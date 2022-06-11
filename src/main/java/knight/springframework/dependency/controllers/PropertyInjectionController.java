package knight.springframework.dependency.controllers;

import knight.springframework.dependency.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectionController {

    @Qualifier("propertyGreetingService")//use this to tell spring what you need to inject for your class-- in this case a greeting service
    @Autowired
    public GreetingService greetingService;

    public String getGreetingService() {

        return greetingService.sayHello();
    }



}
