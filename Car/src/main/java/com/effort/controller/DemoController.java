package com.effort.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {

	private static Logger log = Logger.getLogger(DemoController.class);
	
	@RequestMapping("index")
	public String demo(){
		try {
			throw new Exception("抛出一个异常");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e);
		}
		return "index";
	}
}
