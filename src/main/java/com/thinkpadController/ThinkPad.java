package com.thinkpadController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/think")
public class ThinkPad {

	@GetMapping("/thinkpad")
	public void get() {
		 System.out.println("Think Pad");
	}
}
