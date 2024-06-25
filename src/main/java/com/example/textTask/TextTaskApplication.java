package com.example.textTask;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TextTaskApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"MyApplicationContext.xml"
		);

		Person person = context.getBean("person", Person.class);
		person.showAnimals();

		context.close();

	}
}
