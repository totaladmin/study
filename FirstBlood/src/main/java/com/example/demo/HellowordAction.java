package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowordAction {
	
	@ResponseBody
	@RequestMapping("/helloword")
	public String helloword() {
		//int i = 1/0;
		return "helloword!";
	}
	
	//@ResponseBody
	@RequestMapping("/index")
	public String index(Map<String, Object> resultMap) {
		resultMap.put("name", "test");
		return "index";
	}

}
