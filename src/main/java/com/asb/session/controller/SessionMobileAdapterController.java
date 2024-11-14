package com.asb.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A SessionMobileAdapterController
 */
@RestController
public class SessionMobileAdapterController {

	@GetMapping(value = "/cloud/api")
	public String testAPI() {
		return "AWS Cloud Test API..........!";
	}

}
