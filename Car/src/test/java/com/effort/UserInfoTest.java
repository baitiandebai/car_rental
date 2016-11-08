package com.effort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.effort.service.UserInfoService;
import com.effort.service.impl.UserInfoServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserInfoTest {
	
	
	@Test
	public void test(){
		System.out.println("asdf");
		UserInfoService userInfoService = new UserInfoServiceImpl();
		userInfoService.getOne();
	}
}
