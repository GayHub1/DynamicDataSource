package com.example.DynamicDataSource;

import com.example.DynamicDataSource.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicDataSourceApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
		System.out.println("userService.master() = " + userService.master());
		System.out.println("userService.slave() = " + userService.slave());
	}

}
