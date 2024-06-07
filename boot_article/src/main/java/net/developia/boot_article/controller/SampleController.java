package net.developia.boot_article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/rest1")
	public String rest1() {
		return "Hello Restful~~~~~";
	}
}
