package com.fpds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.fpds.entity.QualityFocus;
import com.fpds.service.inter.FocusServiceInter;
import com.fpds.util.UUIDGenerator;

/**
 * 质量热点的相关接口
 * @author LX
 *
 */
@Controller
@RequestMapping("/focus")
public class FocusController {

	@Autowired
	private FocusServiceInter focusService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getNewById(@PathVariable("id")String id){
		return null;
	}
	
	@RequestMapping(value="/save",
			method=RequestMethod.POST,
			produces="application/json;charset=utf-8")
	public String saveNew(@RequestBody String json){
		
		QualityFocus qualityFocus = JSONObject.parseObject(json, QualityFocus.class);
//		qualityFocus.check();
		qualityFocus.setId(UUIDGenerator.getUUID());
		String result = focusService.saveNew(qualityFocus);
		return result;
	}
	
}
