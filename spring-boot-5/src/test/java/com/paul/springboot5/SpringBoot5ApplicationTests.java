package com.paul.springboot5;

import com.paul.springboot5.dao.UserRepository;
import com.paul.springboot5.vo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot5ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test(){
		userRepository.save(new User("Paul1", 21));
		userRepository.save(new User("Paul2", 22));
		userRepository.save(new User("Paul3", 23));
		userRepository.save(new User("Paul4", 24));
		userRepository.save(new User("Paul5", 25));

		Assert.assertEquals(5, userRepository.findAll().size());

		Assert.assertEquals(24, userRepository.findByName("Paul4").getAge().intValue());

		Assert.assertEquals(25, userRepository.findUser("Paul5").getAge().intValue());

		Assert.assertEquals("Paul2", userRepository.findByNameAndAge("Paul2", 22).getName());

		userRepository.delete(userRepository.findByName("Paul3"));

		Assert.assertEquals(4, userRepository.findAll().size());

	}
}
