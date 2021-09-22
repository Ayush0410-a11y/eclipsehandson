package com.org.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyJuintFristClass {
	@BeforeAll
	static void beforeall() {
		System.out.println("before all called");
		
	}
	@AfterAll
	static void afterall() {
		System.out.println("after all called");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup excuted");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("teardown excuted");
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("Test1 excuted");
	}

}
