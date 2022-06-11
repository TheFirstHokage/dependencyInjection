package knight.springframework.dependency.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "hello world--setter";
    }
}
