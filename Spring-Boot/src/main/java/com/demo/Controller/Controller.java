package com.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hello")
	public String SayHi()
	{
		return "Hi...";
	}
}
