package io.github.misterbug5.mywebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class MywebsiteApplication {

	@RequestMapping("/")
	String home(){
		return "<strong>Hello World!</strong> how are you today?";
	}

	@RequestMapping("*")
	String defaultPage(){
		return "You are in default";
	}

	@RequestMapping("index")
	String courses(){
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(MywebsiteApplication.class, args);
	}

}
