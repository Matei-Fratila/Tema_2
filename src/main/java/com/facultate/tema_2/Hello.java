package com.facultate.tema_2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class Hello {
	
	@RequestMapping("{name}")
	public String helloPerson(@PathVariable("name") String name) {
		return "Hello" + name;
	}

}
