package com.fpds.service.inter;

import com.fpds.entity.QualityFocus;

public interface FocusServiceInter {

	QualityFocus getNewById(String id);
	
	public String saveNew(QualityFocus qualityFocus);
}
