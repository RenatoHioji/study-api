package com.example.api;

import com.tngtech.archunit.core.domain.JavaClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class ApiApplicationTests {

	@Test
	void verifyModularity(){
		ApplicationModules modules = ApplicationModules.of(ApiApplication.class, JavaClass.
				Predicates.resideInAPackage("shared"));
		modules.verify();
	}
}
