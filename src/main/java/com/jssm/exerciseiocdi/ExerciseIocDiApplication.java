package com.jssm.exerciseiocdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExerciseIocDiApplication {

	public static void main(String[] args) {
		
		// Read Spring config Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from the Spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// Call a Method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Call the method to get the daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Call the methods to get the properties that were injected
		System.out.println(">> email: " + theCoach.getEmail());
		System.out.println(">> team: " + theCoach.getTeam());
		
		// close the context
		context.close();
			
//		SpringApplication.run(ExerciseIocDiApplication.class, args);
	}

}
