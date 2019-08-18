package ir.microservices.security.login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoginService {

	@Value("${server.port}")
	public String port;
	
	@RequestMapping("/login")
	public String login(){
		return "hello from the port : " + this.port;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LoginService.class, args);
	}

	
	
}