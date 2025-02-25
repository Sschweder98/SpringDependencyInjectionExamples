package com.example.SpringDependencyInjectionExamples;

import com.example.SpringDependencyInjectionExamples.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringDependencyInjectionExamplesApplication.class, args);

		System.out.println("----------------- Profile: EN, default");
		//In application.properties the profile is set to "EN"
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----------------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("----------------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
