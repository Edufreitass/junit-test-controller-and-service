package com.techprimers.test.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.test.model.Hello;
import com.techprimers.test.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloResource {

	@Autowired
	private HelloService helloService;
	
	@GetMapping
	public String helloWorld() {
		return helloService.hello();
	}

	@GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hello json() {
		return new Hello("Greetings", "Hello World");
	}
	
	@PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Hello post(@RequestBody Hello hello) {
		return hello;
	}

}
