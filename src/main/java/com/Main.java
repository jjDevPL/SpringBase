package com;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.service.Test1;

@SpringBootApplication
public class Main implements CommandLineRunner{
	@Autowired
	private Test1 test;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
 
    }
    
    public void run(String... strings) throws Exception {
    	
        test.main();
    }
    

}