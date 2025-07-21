package com.docker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocekrController {
	
		@GetMapping("/message")
		public String test() {
			return "hello";
		}
}
