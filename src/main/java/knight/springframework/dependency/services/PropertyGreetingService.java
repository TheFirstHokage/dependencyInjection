package knight.springframework.dependency.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello world - property";
    }
}
