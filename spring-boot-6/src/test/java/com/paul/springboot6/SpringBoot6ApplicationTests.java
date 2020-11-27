package com.paul.springboot6;

import com.paul.springboot6.dao.UserRepository;
import com.paul.springboot6.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot6ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CacheManager cacheManager;

	@Test
	public void test(){
		userRepository.save(new User("Paul1", 21));

		User p1 = userRepository.findByName("Paul1");
		System.out.println("年龄："+p1.getAge());

		User p2 = userRepository.findByName("Paul1");
		System.out.println("年龄："+p2.getAge());
	}

}
