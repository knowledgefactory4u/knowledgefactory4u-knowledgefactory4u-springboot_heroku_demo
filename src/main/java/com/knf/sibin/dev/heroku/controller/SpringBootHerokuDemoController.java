package com.knf.sibin.dev.heroku.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHerokuDemoController {
	@GetMapping(value="/",produces=("application/json"))
	public Map<String, String> greetingsFromServer() {

		Map<String, String> stringGreetingsObject = new HashMap<String, String>();

		stringGreetingsObject.put("Status", "Success");

		stringGreetingsObject.put("Content", "Greetings from server");

		return stringGreetingsObject;
	}
}