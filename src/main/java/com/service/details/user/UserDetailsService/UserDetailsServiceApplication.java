package com.service.details.user.UserDetailsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import com.userdetails.model.UserDetails;
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
@ComponentScan({"com.userdetails.controller","com.userdetails.service","com.userdetails.dao"})
@EntityScan( basePackages = {"com.userdetails.model"} )
public class UserDetailsServiceApplication {//extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsServiceApplication.class, args);
	}
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(UserDetailsServiceApplication.class);
	}*/
	@Bean
	public UserDetails userDetails() {
	    return (new UserDetails());
	}
}
