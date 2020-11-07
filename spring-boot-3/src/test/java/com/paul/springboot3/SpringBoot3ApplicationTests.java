package com.paul.springboot3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot3ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void test(){
		userMapper.insert("Paul", 20);
		User user = userMapper.findByName("Paul");
		Assert.assertEquals(20, user.getAge().intValue());

		user.setAge(30);
		userMapper.update(user);

		user = userMapper.findByName("Paul");
		Assert.assertEquals(30, user.getAge().intValue());

		userMapper.delete(user.getId());
		user = userMapper.findByName("Paul");
		Assert.assertEquals(null, user);
	}
}
