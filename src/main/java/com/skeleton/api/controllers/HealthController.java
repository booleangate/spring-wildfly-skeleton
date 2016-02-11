package com.skeleton.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/health")
public class HealthController {
	@RequestMapping("/ping")
	@ResponseBody
	public String ping() {
		return "OK";
	}
}