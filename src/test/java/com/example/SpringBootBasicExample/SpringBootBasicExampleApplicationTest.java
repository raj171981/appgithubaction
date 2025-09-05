package com.example.SpringBootBasicExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpringBootBasicExampleApplicationTest {

	@Test
	void testAddNumbers() {
		int result = SpringBootBasicExampleApplication.addNumbers(10, 20);

        assertEquals(30, result, "10 + 20 should equal 30");
	}

}
