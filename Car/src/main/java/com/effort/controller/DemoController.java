package com.effort.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.effort.entity.UserInfo;
import com.effort.service.UserInfoService;

@Controller
@RequestMapping("demo")
public class DemoController {

	@Autowired
	private UserInfoService userInfoService;
	
	private static Logger log = Logger.getLogger(DemoController.class);
	
	@RequestMapping("index")
	@ResponseBody
	public String demo(){
		
		UserInfo userInfo = null;
		try {
			userInfo = userInfoService.getOne();
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
		String returnStr = JSONObject.toJSONString(userInfo);
		return returnStr;
	}
}
