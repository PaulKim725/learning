package com.paul.springboot4;

import com.paul.springboot4.mbg.model.User;
import com.paul.springboot4.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class SpringBoot4ApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	@Rollback
	public void test() {
		User user = new User();
		user.setName("Paul");
		user.setAge(20);
		userService.insert(user);

		List<User> userList = userService.getUserByName("Paul");
		Assert.assertEquals(20, userList.get(0).getAge().intValue());
	}

}
