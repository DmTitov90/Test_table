package com.example.springdemo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
@EnableAutoConfiguration
@ComponentScan({"com.example.springdemo"})
@EnableJpaRepositories({"com.example.springdemo"})
@Ignore
public class SpringDemoApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
	}


	@Test
	public void get(){

	}

}
