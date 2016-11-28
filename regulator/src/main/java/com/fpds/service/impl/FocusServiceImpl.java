package com.fpds.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpds.dao.QualityFocusMapper;
import com.fpds.entity.QualityFocus;
import com.fpds.service.inter.FocusServiceInter;
import com.fpds.util.Contants;

@Service
public class FocusServiceImpl implements FocusServiceInter {

	private static Logger log = Logger.getLogger(FocusServiceImpl.class);
	
	@Autowired
	private QualityFocusMapper focusDao;
	
	@Override
	public QualityFocus getNewById(String id) {
		
		return focusDao.getNewById(id);
	}

	@Override
	public String saveNew(QualityFocus qualityFocus) {
		String result;
		try {
			result = focusDao.saveNew(qualityFocus) + "";
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			result = Contants.SAVE_ERROR;
		}
		return result;
	}

}
