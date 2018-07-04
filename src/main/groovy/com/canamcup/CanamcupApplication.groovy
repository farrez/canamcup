package com.canamcup

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class CanamcupApplication {

	@Controller
	public static class MasterController {
		@RequestMapping("/")
		public String index() {
			return "index";
		}
	}

	static void main(String[] args) {
		SpringApplication.run CanamcupApplication, args
	}
}
