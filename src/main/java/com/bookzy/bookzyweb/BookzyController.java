package com.bookzy.bookzyweb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BookzyController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to Bookzy Web Store!";
	}

}
