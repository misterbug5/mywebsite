package io.github.misterbug5.mywebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class MywebsiteApplication {

	@RequestMapping("{symbolicName:^(?!api$).*$}")
	String courses(){
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(MywebsiteApplication.class, args);
	}

}
