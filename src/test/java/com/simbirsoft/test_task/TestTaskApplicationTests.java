package com.simbirsoft.test_task;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

@SpringBootTest
class TestTaskApplicationTests {

	@Test
	void contextLoads() {

		Argon2PasswordEncoder encoder
				= new Argon2PasswordEncoder(16, 32, 1, 4096, 3);
		String hui = encoder.encode("hui");
		String bui = encoder.encode("bui");
		String jui = encoder.encode("jui");
		System.out.println(hui);
		System.out.println(bui);
		System.out.println(jui);
		System.out.println(hui.length());
		System.out.println(bui.length());
		System.out.println(jui.length());

	}

}
