package knight.springframework.dependency.controllers;

import knight.springframework.dependency.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectionController();
        controller.setGreetingService(new ConstructorGreetingService());

    }


    @Test
    void getService() {
        System.out.println(controller.getGreetingService());
    }

}
