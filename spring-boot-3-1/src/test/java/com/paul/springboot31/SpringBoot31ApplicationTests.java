package com.paul.springboot31;

import com.paul.springboot31.mapper.UserMapper;
import com.paul.springboot31.vo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class SpringBoot31ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void test() {
		userMapper.insert("Paul", 20);
		User user = userMapper.findByName("Paul");
		Assert.assertEquals(20, user.getAge().intValue());
	}

}
