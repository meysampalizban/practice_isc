package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PracticeApplication extends Thread{
	
	public static void main(String[] args){
		SpringApplication.run(PracticeApplication.class,args);
	}
	
}
