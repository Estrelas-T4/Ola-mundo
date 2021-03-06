package br.com.zup.OlaMundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class OlaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
	}

	@GetMapping("/ola")
	public String saudarOMundo(){
		return "olaMundo";
	}

}
