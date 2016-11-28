package com.fpds.dao;

import com.fpds.entity.QualityFocus;

public interface QualityFocusMapper {
    int deleteByPrimaryKey(String id);

    int saveNew(QualityFocus qualityFocus);

    int insertSelective(QualityFocus record);

    QualityFocus getNewById(String id);

    int updateByPrimaryKeySelective(QualityFocus record);

    int updateByPrimaryKeyWithBLOBs(QualityFocus record);

    int updateByPrimaryKey(QualityFocus record);
}