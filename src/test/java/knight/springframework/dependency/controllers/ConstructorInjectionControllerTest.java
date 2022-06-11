package knight.springframework.dependency.controllers;

import knight.springframework.dependency.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {


    ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new ConstructorGreetingService());
    }


    @Test
    void getGreetingService() {

        System.out.println(controller.getGreetingService());
    }
}