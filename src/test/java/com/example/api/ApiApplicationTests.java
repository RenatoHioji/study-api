package com.example.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class ApiApplicationTests {

	@Test
	void verifyModularity(){
		ApplicationModules modules = ApplicationModules.of(ApiApplication.class);
		modules.verify();
	}
}
