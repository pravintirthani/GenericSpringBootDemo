package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.demo.Application;


@SpringBootApplication
/*(scanBasePackages={"com.demo"})
@ComponentScan({"com.demo"})
@EntityScan("com.demo")
@EnableJpaRepositories("com.demo")*/
public class Application {

	public static void main(String[] args) {		
		SpringApplication.run(Application.class, args);
	}
}
