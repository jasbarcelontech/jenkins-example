package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class DemoApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		int N = 3;
		boolean inclusive6to20 = N >= 6 && N <=20;
		boolean isEven = N % 2 == 0;
		boolean isOdd = !(N % 2 == 0);
		if((isEven && inclusive6to20) || isOdd){
			System.out.println("Weird");
		}else if(!(N % 2 ==0)){
			System.out.println("Not Weird");
		}
	}

	@Test
	void test(){
		List<String> test = Arrays.asList("a", "b", "c");
		logger.info(test.toString());
		List<String> test1 = new ArrayList<>();
		logger.info(test1.toString());
	}

	@Test
	void test1(){
		List<String> test = Arrays.asList("a", "b", "c");
		test = test.stream().filter(testing -> "a".equals(testing)).collect(Collectors.toList());
		logger.info(test.toString());
	}
}
