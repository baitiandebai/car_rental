package com.fpds.dao;

import com.fpds.entity.QualityExposure;

public interface QualityExposureMapper {
    int deleteByPrimaryKey(String id);

    int insert(QualityExposure record);

    int insertSelective(QualityExposure record);

    QualityExposure selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QualityExposure record);

    int updateByPrimaryKey(QualityExposure record);
}