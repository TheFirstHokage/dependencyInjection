package knight.springframework.dependency;

import knight.springframework.dependency.controllers.ConstructorInjectionController;
import knight.springframework.dependency.controllers.MyController;
import knight.springframework.dependency.controllers.PropertyInjectionController;
import knight.springframework.dependency.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyApplication {
	//dependency injection for 5 year olds:
	//class states a need to mom for something and mom makes sure i get it
	// so i -the class- dont have to get it...mom is spring
	//class being injected has no responsibility in creating object

	//BEST practice: Constructor
	//Also use DI with Interfaces  use final kw



	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyApplication.class, args);

		//spring is creating the bean or object for me
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("Primary bean ");
		System.out.println(myController.sayHello());


		System.out.println("-----property ");

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreetingService());

		System.out.println("-----setter ");
		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreetingService());

		System.out.println("------Constructor");
		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreetingService());





	}

}
