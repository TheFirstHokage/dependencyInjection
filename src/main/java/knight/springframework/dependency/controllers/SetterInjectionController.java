package knight.springframework.dependency.controllers;

import knight.springframework.dependency.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    @Qualifier("setterGreetingService")
    @Autowired//we want greetingservice injected into class
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetingService() {
        return  greetingService.sayHello();
    }

}
