package knight.springframework.dependency.services;

import org.springframework.stereotype.Service;
//Now use this keyword bc it is a service that i want my controller to use
//now spring knows to bring an instance into the context
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello world--construct";
    }
}
