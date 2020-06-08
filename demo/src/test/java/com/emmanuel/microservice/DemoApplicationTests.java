package com.emmanuel.microservice;

import static org.assertj.core.api.Assertions.assertThat;
import com.emmanuel.microservice.controllers.GreetingController;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate template;

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {


	}

}
