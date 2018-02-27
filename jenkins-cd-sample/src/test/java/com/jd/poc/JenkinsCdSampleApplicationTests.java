package com.jd.poc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.jd.poc.controller.SampleController;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class JenkinsCdSampleApplicationTests {
	
	 @LocalServerPort
	 private int port;
	 
	 @Autowired
	 private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
		   assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/sample",
	                String.class)).contains("Returning static String");
	}

}
