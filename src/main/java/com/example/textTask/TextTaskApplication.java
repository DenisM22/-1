package com.example.textTask;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TextTaskApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class
		);

		Person person = context.getBean("person", Person.class);
		person.showAnimals();

		context.close();

	}
}
