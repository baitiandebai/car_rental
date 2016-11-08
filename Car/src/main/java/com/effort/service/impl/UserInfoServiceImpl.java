package com.effort.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.effort.dao.UserInfoMapper;
import com.effort.entity.UserInfo;
import com.effort.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo getOne() {
		if(userInfoMapper == null){
			System.out.println("为空了");
		}
		return userInfoMapper.selectByPrimaryKey("1");
	}

}
