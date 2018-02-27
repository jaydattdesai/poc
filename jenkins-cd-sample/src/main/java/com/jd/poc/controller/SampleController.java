package com.jd.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	@GetMapping("/sample")
	public @ResponseBody String sampleResponse() {
		return "Returning static String";
	}

}
