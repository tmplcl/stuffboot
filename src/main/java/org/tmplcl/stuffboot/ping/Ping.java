package org.tmplcl.stuffboot.ping;

import java.time.LocalDateTime;

public class Ping {
	
	private final LocalDateTime timestamp = LocalDateTime.now();
	private final String message = "pinged successful";
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}

}
