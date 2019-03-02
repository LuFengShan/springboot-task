package com.gx.task.controller;

import com.gx.task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
	@Autowired
	AsyncService service;

	@GetMapping("/asyn")
	public String message() {
		service.asyncOut();
		return "over";
	}
}
