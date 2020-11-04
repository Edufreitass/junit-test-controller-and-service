package com.techprimers.test.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.test.model.Hello;

@RestController
@RequestMapping("/hello")
public class HelloResource {

	@GetMapping
	public String helloWorld() {
		return "hello World!";
	}

	@GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hello json() {
		return new Hello("Greetings", "Hello World");
	}

}
