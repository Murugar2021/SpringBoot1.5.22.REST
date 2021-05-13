package com.iqmsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.iqmsoft.model.Func;
import com.iqmsoft.repository.FuncRepository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class MainApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(FuncRepository repos) {
		return (args) -> {
			repos.save(new Func("Test", "Test", 
                                "123455667", new Integer("19"), new Integer("123456"),
                                "Test", new Double("11000")));
                        repos.save(new Func("Test1", "Test1", 
                                "123455667", new Integer("19"), new Integer("123456"),
                                "Test1", new Double("12000")));
		};
	}
}
