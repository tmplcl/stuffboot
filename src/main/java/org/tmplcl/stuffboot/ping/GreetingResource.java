package org.tmplcl.stuffboot.ping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResource {
	
	@RequestMapping("/ping")
	public Ping ping() {
		return new Ping();
	}

}
